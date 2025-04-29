package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Bottle;
import com.xowrkz.oops.internal.ThermosBottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.storeLiquid();

        Bottle thermoAsBottle = new ThermosBottle(); // Upcasting
        thermoAsBottle.storeLiquid();

        System.out.println("**********");

        ThermosBottle thermos = new ThermosBottle();
        thermos.storeLiquid();
        thermos.showTemperatureControl();

        Bottle b1 = new Bottle();
        b1.setMaterial("Stainless Steel");
        b1.setCapacity(750);

        Bottle b2 = new Bottle(b1); // Copy constructor
        System.out.println(b2);
    }
}
