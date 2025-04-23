package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.AirPurifier;

public class AirPurifierImpl implements AirPurifier {
    public void powerOn() {
        System.out.println("AirPurifier: Powered ON.");
    }
    public void powerOff() {
        System.out.println("AirPurifier: Powered OFF.");
    }
    public void setSpeed(int speed) {
        System.out.println("AirPurifier: Speed set to " + speed + ".");
    }
    public void checkAirQuality() {
        System.out.println("AirPurifier: Air quality is Good.");
    }
    public void cleanFilter() {
        System.out.println("AirPurifier: Filter cleaned.");
    }
}
