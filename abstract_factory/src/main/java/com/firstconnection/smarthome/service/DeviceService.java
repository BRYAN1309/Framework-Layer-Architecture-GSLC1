package com.firstconnection.abstract_factory.smarthome.service;

import com.firstconnection.abstract_factory.smarthome.factory.DeviceFactory;
import com.firstconnection.abstract_factory.smarthome.factory.PremiumDeviceFactory;
import com.firstconnection.abstract_factory.smarthome.factory.StandardDeviceFactory;
import com.firstconnection.abstract_factory.smarthome.product.Light;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    public String createAndTestDevice(String factoryType) {
        DeviceFactory factory;
        if ("premium".equalsIgnoreCase(factoryType)) {
            factory = new PremiumDeviceFactory();
        } else {
            factory = new StandardDeviceFactory();
        }

        Light light = factory.createLight();
        light.turnOn();
        
        //Bisa simpan dan kelola objek di bagian ini, tapi kembaliin statusnya dulu aja untuk demonstrasi.
        return light.getStatus();
    }
}