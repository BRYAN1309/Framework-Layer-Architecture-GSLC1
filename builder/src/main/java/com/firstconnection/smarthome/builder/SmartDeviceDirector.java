package com.firstconnection.smarthome.builder;

import com.firstconnection.smarthome.entity.Device;
import com.firstconnection.smarthome.entity.DeviceType;

public class SmartDeviceDirector {

    private final DeviceBuilder builder;

    public SmartDeviceDirector(DeviceBuilder builder) {
        this.builder = builder;
    }

    public Device constructBasicLight(String location) {
        return builder
                .setName("Smart Light")
                .setType(DeviceType.LIGHT)
                .setLocation(location)
                .setStatus(false)
                .setPowerUsage(15)
                .build();
    }

    public Device constructAirConditioner(String location) {
        return builder
                .setName("Air Conditioner")
                .setType(DeviceType.AIR_CONDITIONER)
                .setLocation(location)
                .setStatus(false)
                .setPowerUsage(350)
                .build();
    }
}
