package com.java.method.internal;

public class RunnerAthlete extends Athlete {
    public RunnerAthlete() {
        System.out.println("RunnerAthlete ties shoes");
    }

    @Override
    public void compete() {
        System.out.println("Running in 100m race");
    }

    public void stretch() {
        System.out.println("Stretching after race");
    }
}
