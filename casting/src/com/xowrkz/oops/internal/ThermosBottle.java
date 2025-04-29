package com.xowrkz.oops.internal;

public class ThermosBottle extends Bottle {

    public ThermosBottle() {
        System.out.println("No-arg constructor of ThermosBottle");
    }

    @Override
    public void storeLiquid() {
        System.out.println("ThermosBottle keeps liquids hot or cold.");
    }

    public void showTemperatureControl() {
        System.out.println("ThermosBottle has temperature control feature.");
    }
}
