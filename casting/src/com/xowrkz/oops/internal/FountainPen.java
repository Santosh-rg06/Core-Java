package com.xowrkz.oops.internal;

public class FountainPen extends Pen {

    public FountainPen() {
        System.out.println("No-arg constructor of FountainPen");
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a fountain pen.");
    }

    public void refillInk() {
        System.out.println("Refilling fountain pen with ink.");
    }
}
