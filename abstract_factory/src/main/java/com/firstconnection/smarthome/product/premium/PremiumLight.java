package com.firstconnection.abstract_factory.smarthome.product.premium;

import com.firstconnection.abstract_factory.smarthome.product.Light;

public class PremiumLight implements Light {
    private String status = "OFF";
    private int brightness = 100;

    @Override
    public void turnOn() {
        status = "ON";
    }

    @Override
    public void turnOff() {
        status = "OFF";
    }
    
    public void setBrightness(int level) {
        this.brightness = level;
    }

    @Override
    public String getStatus() {
        return "Premium Light is " + status + " with brightness " + brightness;
    }
}