package com.java.method.internal;

public class TrafficRule extends Rule {
    public TrafficRule() {
        System.out.println("Traffic rule has been activated");
    }

    @Override
    public void applyRule() {
        System.out.println("Drivers must obey traffic signals and signs");
    }

    public void fineViolation() {
        System.out.println("Violation will result in a traffic fine");
    }
}
