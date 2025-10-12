package com.firstconnection.smarthome.service;

import org.springframework.stereotype.Service;
import com.firstconnection.smarthome.builder.DeviceBuilder;
import com.firstconnection.smarthome.builder.SmartDeviceDirector;
import com.firstconnection.smarthome.entity.Device;
import com.firstconnection.smarthome.repository.DeviceRepository;

import java.util.List;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device createDevice(CreateDeviceRequest request) {
        // Gunakan factory untuk membuat instance Device
        Device device = DeviceFactory.createDevice(request.getName(), request.getType());
        return deviceRepository.save(device);
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }
}
