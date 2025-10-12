package com.firstconnection.original.smarthome.service;

import com.firstconnection.original.smarthome.dto.*;
import com.firstconnection.original.smarthome.entity.*;
import com.firstconnection.original.smarthome.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeviceServiceSingleton {

    private static DeviceServiceSingleton instance;
    private final DeviceRepository repo;

    private DeviceServiceSingleton(DeviceRepository repo) {
        this.repo = repo;
    }

    public static synchronized DeviceServiceSingleton getInstance(DeviceRepository repo) {
        if (instance == null) {
            instance = new DeviceServiceSingleton(repo);
        }
        return instance;
    }

    public DeviceResponse createDevice(CreateDeviceRequest req) {
        Device d = new Device();
        d.setName(req.getName());
        d.setType(req.getType() == null ? DeviceType.OTHER : req.getType());
        d.setProperties(req.getProperties() == null ? Map.of() : req.getProperties());
        d.setStatus("OFF");
        d.touch();
        return toResponse(repo.save(d));
    }

    public List<DeviceResponse> getAllDevices() {
        return repo.findAll().stream().map(this::toResponse).collect(Collectors.toList());
    }

    public Optional<DeviceResponse> getDevice(Long id) {
        return repo.findById(id).map(this::toResponse);
    }

    public Optional<DeviceResponse> sendCommand(Long id, CommandRequest cmd) {
        return repo.findById(id).map(device -> {
            String command = cmd.getCommand() == null ? "" : cmd.getCommand().toLowerCase();
            switch (command) {
                case "turn_on": device.setStatus("ON"); break;
                case "turn_off": device.setStatus("OFF"); break;
                case "toggle":
                    device.setStatus("ON".equalsIgnoreCase(device.getStatus()) ? "OFF" : "ON");
                    break;
                case "set_temperature":
                    if (cmd.getArgs() != null && cmd.getArgs().containsKey("temperature"))
                        device.getProperties().put("temperature", cmd.getArgs().get("temperature"));
                    break;
                case "start_recording":
                    if (device.getType() == DeviceType.CAMERA) device.setStatus("RECORDING");
                    break;
                case "stop_recording":
                    if (device.getType() == DeviceType.CAMERA) device.setStatus("ON");
                    break;
                default:
                    device.getProperties().put("last_command", command);
            }
            device.touch();
            return toResponse(repo.save(device));
        });
    }

    private DeviceResponse toResponse(Device d) {
        return new DeviceResponse(d.getId(), d.getName(), d.getType(), d.getStatus(), d.getLastSeen(), d.getProperties());
    }
}