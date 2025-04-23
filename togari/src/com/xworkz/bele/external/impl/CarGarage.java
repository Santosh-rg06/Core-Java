package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Garage;

public class CarGarage implements Garage {
    @Override
    public void parkVehicle() {
        System.out.println("Parking the car in the garage");
    }
}
