package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Vehicle;
import com.xowrkz.oops.internal.ElectricVehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Vehicle ev1 = new ElectricVehicle();
        ev1.start();

        System.out.println("**********");

        ElectricVehicle ev2 = new ElectricVehicle();
        ev2.start();
        ev2.chargeBattery();

        Vehicle v1 = new Vehicle();
        v1.setBrand("Tesla");
        v1.setYear(2024);
        Vehicle v2 = new Vehicle(v1);
        System.out.println(v2);
    }
}
