package com.firstconnection.original.smarthome.controller;

import com.firstconnection.original.smarthome.dto.*;
import com.firstconnection.original.smarthome.repository.DeviceRepository;
import com.firstconnection.original.smarthome.service.DeviceServiceSingleton;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceServiceSingleton service;

    public DeviceController(DeviceRepository repo) {
        this.service = DeviceServiceSingleton.getInstance(repo);
    }

    @PostMapping
    public ResponseEntity<DeviceResponse> createDevice(@RequestBody CreateDeviceRequest req) {
        return ResponseEntity.ok(service.createDevice(req));
    }

    @GetMapping
    public ResponseEntity<List<DeviceResponse>> listDevices() {
        return ResponseEntity.ok(service.getAllDevices());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeviceResponse> getDevice(@PathVariable Long id) {
        return service.getDevice(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/command")
    public ResponseEntity<DeviceResponse> sendCommand(@PathVariable Long id, @RequestBody CommandRequest cmd) {
        return service.sendCommand(id, cmd).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}