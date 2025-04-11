package com.java.method.internal;

public class Bike extends Transport {
    public Bike() {
        System.out.println("bike engine has started");
    }

    @Override
    public void move() {
        System.out.println("bike is speeding on the highway");
    }

    public void applyBrake() {
        System.out.println("bike brake applied safely");
    }
}
