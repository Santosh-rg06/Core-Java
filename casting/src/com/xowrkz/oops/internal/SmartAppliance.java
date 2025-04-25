package com.xowrkz.oops.internal;

public class SmartAppliance extends Appliance {

    public SmartAppliance() {
        System.out.println("No-arg constructor of SmartAppliance");
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Appliance is now ON via app");
    }

    public void connectToWiFi() {
        System.out.println("Connecting to WiFi...");
    }
}
