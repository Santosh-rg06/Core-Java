package com.java.method.internal;

public class Painter extends Artist {
    public Painter() {
        System.out.println("mixing colors for painting");
    }

    @Override
    public void create() {
        System.out.println("painter is working on a canvas");
    }

    public void style() {
        System.out.println("painter uses watercolor technique");
    }
}
