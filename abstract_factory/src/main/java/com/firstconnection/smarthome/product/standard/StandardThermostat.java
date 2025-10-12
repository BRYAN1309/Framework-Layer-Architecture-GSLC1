package com.firstconnection.abstract_factory.smarthome.product.standard;

import com.firstconnection.abstract_factory.smarthome.product.Thermostat;

public class StandardThermostat implements Thermostat {
    private int temperature = 25; // Suhu default

    @Override
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Standard Thermostat temperature set to " + temp + "°C");
    }

    @Override
    public String getStatus() {
        return "Standard Thermostat is set to " + temperature + "°C";
    }
}