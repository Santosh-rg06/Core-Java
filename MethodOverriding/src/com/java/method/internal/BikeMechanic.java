package com.java.method.internal;

public class BikeMechanic extends Mechanic {
    public BikeMechanic() {
        System.out.println("BikeMechanic checks tire pressure");
    }

    @Override
    public void repair() {
        System.out.println("Fixing a bike chain");
    }

    public void testRide() {
        System.out.println("Taking test ride after fix");
    }
}
