package smarthome.dto;

import smarthome.model.Device;
import smarthome.model.DeviceType;

public class DeviceResponse {
    private Long id;
    private String name;
    private DeviceType type;
    private boolean enabled;

    public DeviceResponse(Long id, String name, DeviceType type, boolean enabled) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.enabled = enabled;
    }

    public static DeviceResponse fromEntity(Device device) {
        return new DeviceResponse(device.getId(), device.getName(), device.getType(), device.isEnabled());
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public DeviceType getType() { return type; }
    public boolean isEnabled() { return enabled; }
}
