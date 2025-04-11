package com.java.method.internal;

public class AdventureRunner {
    public static void main(String[] args) {
        Explorer e = new Explorer();
        e.travel();

        Explorer m = new MountainClimber();
        m.travel();

        MountainClimber mc = new MountainClimber();
        mc.travel();
        mc.setupCamp();
    }
}
