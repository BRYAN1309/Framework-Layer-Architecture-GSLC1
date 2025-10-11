package com.firstconnection.smarthome.repository;

import org.springframework.stereotype.Repository;
import com.firstconnection.smarthome.entity.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DeviceRepository {
    private final List<Device> devices = new ArrayList<>();

    public Device save(Device device) {
        devices.add(device);
        return device;
    }

    public List<Device> findAll() {
        return devices;
    }

    public Optional<Device> findById(String id) {
        return devices.stream().filter(d -> d.getId().equals(id)).findFirst();
    }
}
