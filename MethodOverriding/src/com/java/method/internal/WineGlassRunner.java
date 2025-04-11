package com.java.method.internal;

public class WineGlassRunner {
    public static void main(String[] args) {
        Glass g = new Glass();
        g.holdLiquid();

        Glass wg = new WineGlass();
        wg.holdLiquid();

        WineGlass wine = new WineGlass();
        wine.holdLiquid();
        wine.swirl();
    }
}
