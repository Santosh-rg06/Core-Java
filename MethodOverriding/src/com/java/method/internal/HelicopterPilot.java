package com.java.method.internal;

public class HelicopterPilot extends Pilot {
    public HelicopterPilot() {
        System.out.println("HelicopterPilot starts rotor");
    }

    @Override
    public void fly() {
        System.out.println("Flying a helicopter over the city");
    }

    public void hover() {
        System.out.println("Helicopter is hovering");
    }
}
