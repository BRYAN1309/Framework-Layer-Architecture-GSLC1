package com.firstconnection.original.smarthome.controller;

import com.firstconnection.original.smarthome.dto.*;
import com.firstconnection.original.smarthome.service.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
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