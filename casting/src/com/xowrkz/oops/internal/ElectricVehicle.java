package com.xowrkz.oops.internal;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle() {
        System.out.println("No-arg constructor of ElectricVehicle");
    }

    @Override
    public void start() {
        System.out.println("Electric vehicle is starting silently...");
    }

    public void chargeBattery() {
        System.out.println("Charging battery...");
    }
}
