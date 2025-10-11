package smarthome.repository;

import org.springframework.stereotype.Repository;
import smarthome.model.Device;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Repository sederhana (in-memory) untuk menyimpan Device.
 */
@Repository
public class DeviceRepository {
    private final Map<Long, Device> store = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public Device save(Device device) {
        if (device.getId() == null) {
            device.setId(idCounter.getAndIncrement());
        }
        store.put(device.getId(), device);
        return device;
    }

    public Optional<Device> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<Device> findAll() {
        return new ArrayList<>(store.values());
    }

    public void deleteById(Long id) {
        store.remove(id);
    }
}
