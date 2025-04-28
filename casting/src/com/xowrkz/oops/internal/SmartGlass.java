package com.xowrkz.oops.internal;

public class SmartGlass extends Glass {

    public SmartGlass() {
        System.out.println("No-arg constructor of SmartGlass");
    }

    @Override
    public void reflect() {
        System.out.println("SmartGlass adjusts transparency automatically");
    }

    public void connectToWiFi() {
        System.out.println("SmartGlass connected to WiFi!");
    }
}
