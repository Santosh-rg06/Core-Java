package com.java.method.internal;

public class Inverter extends Generator {

    public Inverter() {
        System.out.println("Running the inverter constructor");
    }

    @Override
    public void powerSupply() {
        System.out.println("Running the powerSupply in Inverter");
    }

    public void running() {
        System.out.println("Running the public method");
    }

    public void service() {
        System.out.println("Running the service");
    }
}
