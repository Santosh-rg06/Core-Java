package com.java.method.internal;

public class SharkTank extends FishTank {
    public SharkTank() {
        System.out.println("shark tank is reinforced");
    }

    @Override
    public void fillWater() {
        System.out.println("salt water added to shark tank");
    }

    public void feedSharks() {
        System.out.println("sharks are being fed");
    }
}
