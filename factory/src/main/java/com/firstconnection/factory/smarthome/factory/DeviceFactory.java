package com.firstconnection.factory.smarthome.factory;

import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.entity.DeviceType;

public class DeviceFactory {
    public static Device createDevice(String name, DeviceType type) {
        Device device = new Device();
        device.setName(name);
        device.setType(type);

        // Bisa tambahkan properti default tergantung type
        switch (type) {
            case LIGHT -> device.setStatus("OFF");
            case THERMOSTAT -> device.setStatus("22°C");
            case CAMERA -> device.setStatus("IDLE");
            default -> device.setStatus("UNKNOWN");
        }

        return device;
    }
}
