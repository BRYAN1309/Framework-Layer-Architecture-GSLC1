package com.firstconnection.factory.smarthome.factory;

import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.entity.DeviceType;

public class LightDevice extends Device {
    public LightDevice(String name) {
        super(name, DeviceType.LIGHT, "OFF");
    }
}
