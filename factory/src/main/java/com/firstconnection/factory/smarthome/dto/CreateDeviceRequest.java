package com.firstconnection.factory.smarthome.dto;

import com.firstconnection.factory.smarthome.entity.DeviceType;

public class CreateDeviceRequest {
    private String name;
    private DeviceType type;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DeviceType getType() { return type; }
    public void setType(DeviceType type) { this.type = type; }
}
