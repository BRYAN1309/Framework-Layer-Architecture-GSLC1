package com.firstconnection.factory.smarthome.service;

import com.firstconnection.factory.smarthome.dto.CreateDeviceRequest;
import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.factory.DeviceFactory;
import com.firstconnection.factory.smarthome.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device createDevice(CreateDeviceRequest request) {
        Device device = DeviceFactory.createDevice(request.getName(), request.getType());
        return deviceRepository.save(device);
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }
}
