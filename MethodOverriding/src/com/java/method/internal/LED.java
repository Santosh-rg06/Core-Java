package com.java.method.internal;

public class LED extends Bulb {
    public LED() {
        System.out.println("LED bulb is initialized");
    }

    @Override
    public void lightUp() {
        System.out.println("LED emits bright and energy-efficient light");
    }

    public void saveEnergy() {
        System.out.println("LED bulb consumes less electricity");
    }
}
