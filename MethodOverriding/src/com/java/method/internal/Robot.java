package com.java.method.internal;

public class Robot extends Machine {
    public Robot() {
        System.out.println("robot is initializing AI systems");
    }

    @Override
    public void operate() {
        System.out.println("robot is operating in autonomous mode");
    }

    public void analyze() {
        System.out.println("robot is analyzing environment data");
    }
}
