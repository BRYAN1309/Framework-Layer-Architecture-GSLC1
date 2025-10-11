package com.firstconnection.factory.smarthome.entity;


import jakarta.persistence.*;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private DeviceType type;

    private String status;

    public Device() {}

    public Device(String name, DeviceType type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DeviceType getType() { return type; }
    public void setType(DeviceType type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
