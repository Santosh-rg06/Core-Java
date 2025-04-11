package com.java.method.internal;

public class Device {
    protected Device() {
        System.out.println("booting generic device");
    }

    public void start() {
        System.out.println("device is powering on");
    }
}
