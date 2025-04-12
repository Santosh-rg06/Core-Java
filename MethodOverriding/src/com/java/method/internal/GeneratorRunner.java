package com.java.method.internal;

public class GeneratorRunner {
    public static void main(String[] args) {

        Generator g = new Generator();  // Object of parent class
        g.powerSupply();                // Calls Generator method

        Generator g1 = new Inverter();  // Upcasting
        g1.powerSupply();               // Calls overridden method in Inverter

        Inverter inv = (Inverter) g1;   // Downcasting
        inv.service();                  // Inve
        inv.running();
    }
}
