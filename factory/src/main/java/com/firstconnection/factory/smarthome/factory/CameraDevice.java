package com.firstconnection.factory.smarthome.factory;

import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.entity.DeviceType;

public class CameraDevice extends Device {
    public CameraDevice(String name) {
        super(name, DeviceType.CAMERA, "STANDBY");
    }
}
