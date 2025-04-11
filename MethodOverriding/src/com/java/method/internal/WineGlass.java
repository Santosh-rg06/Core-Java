package com.java.method.internal;

public class WineGlass extends Glass {
    public WineGlass() {
        System.out.println("Wine glass is polished and ready");
    }

    @Override
    public void holdLiquid() {
        System.out.println("Wine glass holds red or white wine");
    }

    public void swirl() {
        System.out.println("Swirling the wine inside the glass");
    }
}
