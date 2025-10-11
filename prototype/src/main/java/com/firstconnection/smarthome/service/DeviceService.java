package smarthome.service;

import org.springframework.stereotype.Service;
import smarthome.dto.CreateDeviceRequest;
import smarthome.model.Device;
import smarthome.pattern.prototype.DevicePrototype;
import smarthome.repository.DeviceRepository;

import java.util.List;
import java.util.Optional;

/**
 * Service layer yang memanfaatkan Prototype Pattern untuk cloning device.
 */
@Service
public class DeviceService {

    private final DeviceRepository repository;

    public DeviceService(DeviceRepository repository) {
        this.repository = repository;
    }

    public Device createDevice(CreateDeviceRequest req) {
        Device device = new Device(null, req.getName(), req.getType(), req.isEnabled());
        return repository.save(device);
    }

    public List<Device> getAllDevices() {
        return repository.findAll();
    }

    public Optional<Device> getDeviceById(Long id) {
        return repository.findById(id);
    }

    public void deleteDevice(Long id) {
        repository.deleteById(id);
    }

    /**
     * Prototype Pattern digunakan di sini.
     * Mengkloning device dengan ID tertentu tanpa membuat dari awal.
     */
    public Optional<Device> cloneDevice(Long id) {
        Optional<Device> existing = repository.findById(id);
        if (existing.isEmpty()) return Optional.empty();

        DevicePrototype prototype = new DevicePrototype(existing.get());
        Device cloned = prototype.clone();
        return Optional.of(repository.save(cloned));
    }
}
