package com.java.method.internal;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        System.out.println("WaterBottle ready to use");
    }

    @Override
    public void fill() {
        System.out.println("Filling the water bottle with clean water");
    }

    public void chill() {
        System.out.println("Chilling the water for freshness");
    }
}
