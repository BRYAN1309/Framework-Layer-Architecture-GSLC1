package com.firstconnection.original.smarthome.dto;

import com.firstconnection.original.smarthome.entity.DeviceType;
import java.util.Map;

public class CreateDeviceRequest {
    private String name;
    private DeviceType type;
    private Map<String, String> properties;

    public CreateDeviceRequest() {}

    public String getName() { return name; }
    public DeviceType getType() { return type; }
    public Map<String, String> getProperties() { return properties; }

    public void setName(String name) { this.name = name; }
    public void setType(DeviceType type) { this.type = type; }
    public void setProperties(Map<String, String> properties) { this.properties = properties; }
}
