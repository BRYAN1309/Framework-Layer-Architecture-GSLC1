package com.firstconnection.abstract_factory.smarthome.factory;

import com.firstconnection.abstract_factory.smarthome.product.Light;
import com.firstconnection.abstract_factory.smarthome.product.Thermostat;

public interface DeviceFactory {
    Light createLight();
    Thermostat createThermostat();
}