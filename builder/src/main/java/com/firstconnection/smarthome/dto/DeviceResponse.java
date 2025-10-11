package com.firstconnection.smarthome.dto;

import com.firstconnection.smarthome.entity.Device;
import com.firstconnection.smarthome.entity.DeviceType;

public class DeviceResponse {
    private String id;
    private String name;
    private DeviceType type;
    private String location;

    public DeviceResponse(Device device) {
        this.id = device.getId();
        this.name = device.getName();
        this.type = device.getType();
        this.location = device.getLocation();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public DeviceType getType() { return type; }
    public String getLocation() { return location; }
}
