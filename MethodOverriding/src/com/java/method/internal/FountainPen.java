package com.java.method.internal;

public class FountainPen extends Pen {
    public FountainPen() {
        System.out.println("Fountain pen is created");
    }

    @Override
    public void write() {
        System.out.println("Writing with smooth ink using fountain pen");
    }

    public void refillInk() {
        System.out.println("Fountain pen is being refilled with ink");
    }
}
