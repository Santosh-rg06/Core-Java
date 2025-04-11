package com.java.method.internal;

public class Designer extends Tailor {
    public Designer() {
        System.out.println("Designer sketches a new outfit");
    }

    @Override
    public void stitch() {
        System.out.println("Stitching a designer dress");
    }

    public void style() {
        System.out.println("Styling the outfit");
    }
}
