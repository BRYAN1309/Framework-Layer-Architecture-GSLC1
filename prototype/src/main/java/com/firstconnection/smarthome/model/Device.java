package smarthome.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Kelas Entity sederhana mewakili sebuah Device.
 */
public class Device {
    private Long id;
    private String name;
    private DeviceType type;
    private boolean enabled;
    private Map<String, String> metadata = new HashMap<>();

    public Device() {}

    public Device(Long id, String name, DeviceType type, boolean enabled) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.enabled = enabled;
        this.metadata = new HashMap<>();
    }

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DeviceType getType() { return type; }
    public void setType(DeviceType type) { this.type = type; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public Map<String, String> getMetadata() { return metadata; }
    public void setMetadata(Map<String, String> metadata) { this.metadata = metadata; }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", enabled=" + enabled +
                ", metadata=" + metadata +
                '}';
    }
}
