package com.firstconnection.factory.smarthome.controller;

import com.firstconnection.factory.smarthome.dto.CreateDeviceRequest;
import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping
    public Device createDevice(@RequestBody CreateDeviceRequest request) {
        return deviceService.createDevice(request);
    }

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }
}
