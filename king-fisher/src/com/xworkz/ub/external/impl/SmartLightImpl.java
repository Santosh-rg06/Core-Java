package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartLight;

public class SmartLightImpl implements SmartLight {
    public void turnOn() {
        System.out.println("SmartLight: Turned ON.");
    }
    public void turnOff() {
        System.out.println("SmartLight: Turned OFF.");
    }
    public void setBrightness(int level) {
        System.out.println("SmartLight: Brightness set to " + level + "%.");
    }
    public void setColor(String color) {
        System.out.println("SmartLight: Color changed to " + color + ".");
    }
    public void scheduleTimer(String time) {
        System.out.println("SmartLight: Timer scheduled at " + time + ".");
    }
}
