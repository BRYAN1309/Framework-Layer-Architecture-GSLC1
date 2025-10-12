package com.firstconnection.original.smarthome.controller;

import com.firstconnection.original.smarthome.dto.CreateDeviceRequest;
import com.firstconnection.original.smarthome.entity.DeviceType;
import com.firstconnection.original.smarthome.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/benchmark")
public class BenchmarkController {

    private final DeviceService deviceService;

    public BenchmarkController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/create-device")
    public Map<String, Object> benchmarkCreateDevice() {
        long start = System.nanoTime();

        // simulasi permintaan pembuatan device
        CreateDeviceRequest req = new CreateDeviceRequest();
        req.setName("Living Room Lamp");
        req.setType(DeviceType.LIGHT);

        deviceService.createDevice(req);

        long end = System.nanoTime();

        long executionTimeMs = (end - start) / 1_000_000;

        Map<String, Object> result = new HashMap<>();
        result.put("executionTimeMs", executionTimeMs);
        result.put("message", "Device creation benchmark completed");
        return result;
    }
}
