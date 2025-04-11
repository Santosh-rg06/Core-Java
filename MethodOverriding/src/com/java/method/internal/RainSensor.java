package com.java.method.internal;

public class RainSensor extends Sensor {
    public RainSensor() {
        System.out.println("rain sensor is now detecting rain");
    }

    @Override
    public void read() {
        System.out.println("detecting rain intensity and reporting");
    }

    public void alert() {
        System.out.println("rain alert sent to users");
    }
}
