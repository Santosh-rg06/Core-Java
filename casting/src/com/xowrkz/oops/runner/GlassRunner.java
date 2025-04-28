package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Glass;
import com.xowrkz.oops.internal.SmartGlass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass simpleGlass = new Glass();
        simpleGlass.reflect();

        Glass smartGlassAsGlass = new SmartGlass(); // Upcasting
        smartGlassAsGlass.reflect();

        System.out.println("**********");

        SmartGlass smart = new SmartGlass();
        smart.reflect();
        smart.connectToWiFi();

        Glass g1 = new Glass();
        g1.setMaterial("Tempered");
        g1.setThickness(5.0);

        Glass g2 = new Glass(g1); // Copy constructor
        System.out.println(g2);
    }
}
