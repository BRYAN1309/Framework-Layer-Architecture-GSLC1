package smarthome.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smarthome.dto.CreateDeviceRequest;
import smarthome.dto.DeviceResponse;
import smarthome.model.Device;
import smarthome.service.DeviceService;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DeviceResponse> create(@RequestBody CreateDeviceRequest req) {
        Device device = service.createDevice(req);
        return ResponseEntity.created(URI.create("/api/devices/" + device.getId()))
                .body(DeviceResponse.fromEntity(device));
    }

    @GetMapping
    public ResponseEntity<List<DeviceResponse>> list() {
        List<DeviceResponse> list = service.getAllDevices()
                .stream().map(DeviceResponse::fromEntity).collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }

    @PostMapping("/{id}/clone")
    public ResponseEntity<DeviceResponse> cloneDevice(@PathVariable Long id) {
        Optional<Device> cloned = service.cloneDevice(id);
        return cloned.map(device -> ResponseEntity.created(URI.create("/api/devices/" + device.getId()))
                        .body(DeviceResponse.fromEntity(device)))
                .orElse(ResponseEntity.notFound().build());
    }
}
