package com.firstconnection.original.smarthome.dto;

import com.firstconnection.original.smarthome.entity.DeviceType;
import java.time.Instant;
import java.util.Map;

public class DeviceResponse {
    private Long id;
    private String name;
    private DeviceType type;
    private String status;
    private Instant lastSeen;
    private Map<String, String> properties;

    public DeviceResponse() {}

    public DeviceResponse(Long id, String name, DeviceType type, String status, Instant lastSeen, Map<String, String> properties) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.lastSeen = lastSeen;
        this.properties = properties;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public DeviceType getType() { return type; }
    public String getStatus() { return status; }
    public Instant getLastSeen() { return lastSeen; }
    public Map<String, String> getProperties() { return properties; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setType(DeviceType type) { this.type = type; }
    public void setStatus(String status) { this.status = status; }
    public void setLastSeen(Instant lastSeen) { this.lastSeen = lastSeen; }
    public void setProperties(Map<String, String> properties) { this.properties = properties; }
}