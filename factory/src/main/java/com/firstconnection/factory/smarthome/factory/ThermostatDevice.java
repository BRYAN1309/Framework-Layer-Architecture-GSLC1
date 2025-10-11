package com.firstconnection.factory.smarthome.factory;

import com.firstconnection.factory.smarthome.entity.Device;
import com.firstconnection.factory.smarthome.entity.DeviceType;

public class ThermostatDevice extends Device {
    public ThermostatDevice(String name) {
        super(name, DeviceType.THERMOSTAT, "IDLE");
    }
}
