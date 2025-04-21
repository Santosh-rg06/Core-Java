package com.example.external;

import com.example.internal.Vehicle;

public class Car extends Vehicle {
    @Override
    public void type() {
        System.out.println("Car is a four-wheeled motor vehicle.");
    }

    @Override
    public void fuelType() {
        System.out.println("Uses petrol, diesel, or electricity.");
    }

    @Override
    public void speed() {
        System.out.println("Average speed ranges from 100 to 200 km/h.");
    }

    @Override
    public void usage() {
        System.out.println("Used for personal and family transportation.");
    }

    @Override
    public void maintenance() {
        System.out.println("Requires regular servicing, oil changes, and tire checks.");
    }
}
