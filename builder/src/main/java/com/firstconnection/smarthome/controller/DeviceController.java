package com.firstconnection.smarthome.controller;

import org.springframework.web.bind.annotation.*;
import com.firstconnection.smarthome.entity.Device;
import com.firstconnection.smarthome.service.DeviceService;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @PostMapping("/light")
    public Device createLight(@RequestParam String location) {
        return service.createLight(location);
    }

    @PostMapping("/ac")
    public Device createAirConditioner(@RequestParam String location) {
        return service.createAirConditioner(location);
    }

    @GetMapping
    public List<Device> getAll() {
        return service.getAllDevices();
    }
}
