package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Gym;

public class HomeGym implements Gym {

    @Override
    public void liftWeights() {
        System.out.println("Lifting weights in the gym");
    }

    @Override
    public void doCardio() {
        System.out.println("Doing cardio on the treadmill");
    }

    @Override
    public void stretch() {
        System.out.println("Stretching muscles before and after workout");
    }

    @Override
    public void drinkWater() {
        System.out.println("Drinking water to stay hydrated");
    }

    @Override
    public void monitorHeartRate() {
        System.out.println("Monitoring heart rate using smartwatch");
    }
}
