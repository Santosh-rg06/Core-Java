package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Appliance;
import com.xowrkz.oops.internal.SmartAppliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance basic = new Appliance();
        basic.turnOn();

        Appliance smart1 = new SmartAppliance(); // Upcasting
        smart1.turnOn();

        System.out.println("**********");

        SmartAppliance smart2 = new SmartAppliance();
        smart2.turnOn();
        smart2.connectToWiFi();

        Appliance original = new Appliance();
        original.setBrand("LG");
        original.setPower(800);

        Appliance copy = new Appliance(original);
        System.out.println(copy);
    }
}
