package com.java.method.internal;

public class PenRunner {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.write();

        Pen f = new FountainPen();
        f.write();

        FountainPen fp = new FountainPen();
        fp.write();
        fp.refillInk();
    }
}
