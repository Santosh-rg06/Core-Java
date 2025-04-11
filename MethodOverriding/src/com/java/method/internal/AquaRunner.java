package com.java.method.internal;

public class AquaRunner {
    public static void main(String[] args) {
        FishTank f = new FishTank();
        f.fillWater();

        FishTank s = new SharkTank();
        s.fillWater();

        SharkTank shark = new SharkTank();
        shark.fillWater();
        shark.feedSharks();
    }
}
