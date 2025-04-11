package com.java.method.internal;

public class SmartFridge extends Fridge {
    public SmartFridge() {
        System.out.println("Smart fridge is powered on");
    }

    @Override
    public void coolItems() {
        System.out.println("Smart fridge auto-adjusts temperature");
    }

    public void connectWifi() {
        System.out.println("Smart fridge connected to WiFi");
    }
}
