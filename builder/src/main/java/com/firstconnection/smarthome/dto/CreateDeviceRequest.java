package com.firstconnection.smarthome.dto;

import com.firstconnection.smarthome.entity.DeviceType;

public class CreateDeviceRequest {
    private String name;
    private DeviceType type;
    private String location;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DeviceType getType() { return type; }
    public void setType(DeviceType type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
