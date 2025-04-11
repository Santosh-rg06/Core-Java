package com.java.method.internal;

public class Shark extends Fish {
    public Shark() {
        System.out.println("shark is hunting in deep waters");
    }

    @Override
    public void move() {
        System.out.println("shark is moving swiftly and silently");
    }

    public void attack() {
        System.out.println("shark is launching a surprise attack");
    }
}
