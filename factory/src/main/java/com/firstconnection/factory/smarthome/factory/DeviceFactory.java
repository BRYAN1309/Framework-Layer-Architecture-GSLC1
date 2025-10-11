package com.firstconnection.factory.smarthome.factory;

import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.entity.DeviceType;

public class DeviceFactory {

    public static Device createDevice(String name, DeviceType type) {
        switch (type) {
            case LIGHT:
                return new LightDevice(name);
            case THERMOSTAT:
                return new ThermostatDevice(name);
            case CAMERA:
                return new CameraDevice(name);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
