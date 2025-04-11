package com.java.method.internal;

public class BunkBed extends Bed {
    public BunkBed() {
        System.out.println("Bunk bed is ready");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping on a bunk bed");
    }

    public void climbLadder() {
        System.out.println("Climbing ladder to upper bed");
    }
}
