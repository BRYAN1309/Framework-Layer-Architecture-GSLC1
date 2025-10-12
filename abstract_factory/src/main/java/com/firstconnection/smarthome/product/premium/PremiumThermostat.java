package com.firstconnection.abstract_factory.smarthome.product.premium;

import com.firstconnection.abstract_factory.smarthome.product.Thermostat;

public class PremiumThermostat implements Thermostat {
    private int temperature = 24; // Suhu default
    private boolean powerSavingMode = false;

    @Override
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Premium Thermostat temperature set to " + temp + "°C");
    }

    public void enablePowerSavingMode() {
        this.powerSavingMode = true;
        System.out.println("Premium Thermostat power saving mode is ON");
    }
    
    public void disablePowerSavingMode() {
        this.powerSavingMode = false;
        System.out.println("Premium Thermostat power saving mode is OFF");
    }

    @Override
    public String getStatus() {
        String mode = powerSavingMode ? " (Power Saving)" : "";
        return "Premium Thermostat is set to " + temperature + "°C" + mode;
    }
}