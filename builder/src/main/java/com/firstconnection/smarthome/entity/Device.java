package com.firstconnection.smarthome.entity;

public class Device {
    private String id;
    private String name;
    private DeviceType type;
    private String location;
    private boolean status;
    private int powerUsage;

    public Device() {}

    public Device(String id, String name, DeviceType type, String location, boolean status, int powerUsage) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
        this.powerUsage = powerUsage;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public DeviceType getType() { return type; }
    public String getLocation() { return location; }
    public boolean isStatus() { return status; }
    public int getPowerUsage() { return powerUsage; }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", location='" + location + '\'' +
                ", status=" + status +
                ", powerUsage=" + powerUsage +
                '}';
    }
}
