package com.java.method.internal;

public class FlightRunner {
    public static void main(String[] args) {
        Pilot p = new Pilot();
        p.fly();

        Pilot hp = new HelicopterPilot();
        hp.fly();

        HelicopterPilot heli = new HelicopterPilot();
        heli.fly();
        heli.hover();
    }
}
