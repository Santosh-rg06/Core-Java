package com.java.method.internal;

public class OrbitRunner {
    public static void main(String[] args) {
        Satellite s = new Satellite();
        s.transmit();

        Satellite r = new Rocket();
        r.transmit();

        Rocket rocket = new Rocket();
        rocket.transmit();
        rocket.deployPayload();
    }
}
