package com.java.method.internal;

public class BedRunner {
    public static void main(String[] args) {
        Bed b = new Bed();
        b.sleep();

        Bed bb = new BunkBed();
        bb.sleep();

        BunkBed bunk = new BunkBed();
        bunk.sleep();
        bunk.climbLadder();
    }
}
