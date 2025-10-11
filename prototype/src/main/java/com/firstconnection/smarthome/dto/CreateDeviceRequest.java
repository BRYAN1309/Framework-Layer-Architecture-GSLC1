package smarthome.dto;

import smarthome.model.DeviceType;

public class CreateDeviceRequest {
    private String name;
    private DeviceType type;
    private boolean enabled;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DeviceType getType() { return type; }
    public void setType(DeviceType type) { this.type = type; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
