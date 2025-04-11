package com.java.method.internal;

public class MountainClimber extends Explorer {
    public MountainClimber() {
        System.out.println("MountainClimber wears harness");
    }

    @Override
    public void travel() {
        System.out.println("Climbing high peaks");
    }

    public void setupCamp() {
        System.out.println("Setting up camp at base");
    }
}
