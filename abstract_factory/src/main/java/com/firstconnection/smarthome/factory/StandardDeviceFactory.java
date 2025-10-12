package com.firstconnection.abstract_factory.smarthome.factory;

import com.firstconnection.abstract_factory.smarthome.product.Light;
import com.firstconnection.abstract_factory.smarthome.product.Thermostat;
import com.firstconnection.abstract_factory.smarthome.product.standard.StandardLight;
import com.firstconnection.abstract_factory.smarthome.product.standard.StandardThermostat;

public class StandardDeviceFactory implements DeviceFactory {
    @Override
    public Light createLight() {
        return new StandardLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new StandardThermostat();
    }
}