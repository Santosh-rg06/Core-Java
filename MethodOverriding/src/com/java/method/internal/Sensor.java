package com.java.method.internal;

public class Sensor {
    protected Sensor() {
        System.out.println("sensor is activated");
    }

    public void read() {
        System.out.println("reading environment data");
    }
}
