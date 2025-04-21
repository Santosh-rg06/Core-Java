package com.example.external;

import com.example.internal.Vehicle;

public class Bicycle extends Vehicle {
    @Override
    public void type() {
        System.out.println("Bicycle is a two-wheeled pedal-driven vehicle.");
    }

    @Override
    public void fuelType() {
        System.out.println("Does not use fuel – human-powered.");
    }

    @Override
    public void speed() {
        System.out.println("Average speed ranges from 15 to 30 km/h.");
    }

    @Override
    public void usage() {
        System.out.println("Used for short-distance travel, fitness, and recreation.");
    }

    @Override
    public void maintenance() {
        System.out.println("Requires chain oiling and occasional brake or tire repairs.");
    }
}
