package com.firstconnection.smarthome.builder;

import com.firstconnection.smarthome.entity.Device;
import com.firstconnection.smarthome.entity.DeviceType;
import java.util.UUID;

public class DeviceBuilder {
    private String id;
    private String name;
    private DeviceType type;
    private String location;
    private boolean status;
    private int powerUsage;

    public DeviceBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DeviceBuilder setType(DeviceType type) {
        this.type = type;
        return this;
    }

    public DeviceBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public DeviceBuilder setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public DeviceBuilder setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
        return this;
    }

    public Device build() {
        this.id = UUID.randomUUID().toString();
        return new Device(id, name, type, location, status, powerUsage);
    }
}
