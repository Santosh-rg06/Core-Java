package com.java.method.internal;

public class GamingLaptop extends HP {
    public GamingLaptop() {
        System.out.println("Gaming laptop from HP is ready");
    }

    @Override
    public void deviceInfo() {
        System.out.println("High-performance HP gaming laptop with dedicated GPU");
    }

    public void launchGame() {
        System.out.println("Launching a high-end game on HP laptop");
    }
}
