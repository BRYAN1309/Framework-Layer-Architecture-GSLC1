package com.firstconnection.smarthome.service;

import org.springframework.stereotype.Service;
import com.firstconnection.smarthome.builder.DeviceBuilder;
import com.firstconnection.smarthome.builder.SmartDeviceDirector;
import com.firstconnection.smarthome.entity.Device;
import com.firstconnection.smarthome.repository.DeviceRepository;

import java.util.List;

@Service
public class DeviceService {
    private final DeviceRepository repository;

    public DeviceService(DeviceRepository repository) {
        this.repository = repository;
    }

    public Device createLight(String location) {
        SmartDeviceDirector director = new SmartDeviceDirector(new DeviceBuilder());
        Device light = director.constructBasicLight(location);
        return repository.save(light);
    }

    public Device createAirConditioner(String location) {
        SmartDeviceDirector director = new SmartDeviceDirector(new DeviceBuilder());
        Device ac = director.constructAirConditioner(location);
        return repository.save(ac);
    }

    public List<Device> getAllDevices() {
        return repository.findAll();
    }
}
