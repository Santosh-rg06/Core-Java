package com.java.method.internal;

public class TravelMug extends Mug {
    public TravelMug() {
        System.out.println("Travel mug is created");
    }

    @Override
    public void holdLiquid() {
        System.out.println("Travel mug keeps beverage hot or cold longer");
    }

    public void closeLid() {
        System.out.println("Lid is closed to avoid spilling");
    }
}
