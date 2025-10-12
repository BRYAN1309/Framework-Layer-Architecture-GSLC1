package com.firstconnection.original.smarthome.entity;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private DeviceType type;

    private String status;
    private Instant lastSeen;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "device_properties", joinColumns = @JoinColumn(name = "device_id"))
    @MapKeyColumn(name = "prop_key")
    @Column(name = "prop_value")
    private Map<String, String> properties = new HashMap<>();

    public Device() {}

    public Device(String name, DeviceType type) {
        this.name = name;
        this.type = type;
        this.status = "OFF";
        this.lastSeen = Instant.now();
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

    public void touch() {
        this.lastSeen = Instant.now();
    }
}
