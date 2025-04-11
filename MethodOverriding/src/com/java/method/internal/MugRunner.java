package com.java.method.internal;

public class MugRunner {
    public static void main(String[] args) {
        Mug m = new Mug();
        m.holdLiquid();

        Mug t = new TravelMug();
        t.holdLiquid();

        TravelMug tm = new TravelMug();
        tm.holdLiquid();
        tm.closeLid();
    }
}
