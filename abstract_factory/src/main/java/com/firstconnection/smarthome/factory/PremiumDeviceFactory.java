package com.firstconnection.abstract_factory.smarthome.factory;

import com.firstconnection.abstract_factory.smarthome.product.Light;
import com.firstconnection.abstract_factory.smarthome.product.Thermostat;
import com.firstconnection.abstract_factory.smarthome.product.premium.PremiumLight;
import com.firstconnection.abstract_factory.smarthome.product.premium.PremiumThermostat;

public class PremiumDeviceFactory implements DeviceFactory {
    @Override
    public Light createLight() {
        return new PremiumLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new PremiumThermostat();
    }
}