package com.firstconnection.abstract_factory.smarthome.controller;

import com.firstconnection.abstract_factory.smarthome.service.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createDevice(@RequestParam String type) {
        String status = service.createAndTestDevice(type);
        return ResponseEntity.ok("Device created with status: " + status);
    }
}