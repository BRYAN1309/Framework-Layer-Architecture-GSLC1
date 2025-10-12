package com.firstconnection.abstract_factory.smarthome.product.standard;

import com.firstconnection.abstract_factory.smarthome.product.Light;

public class StandardLight implements Light {
    private String status = "OFF";

    @Override
    public void turnOn() {
        status = "ON";
    }

    @Override
    public void turnOff() {
        status = "OFF";
    }

    @Override
    public String getStatus() {
        return "Standard Light is " + status;
    }
}