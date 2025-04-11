package com.java.method.internal;

public class PrivateJet extends PrivateTransport {
    public PrivateJet() {
        System.out.println("PrivateJet booking confirmed");
    }

    @Override
    public void travel() {
        System.out.println("Flying in a luxury private jet");
    }

    public void flightDuration() {
        System.out.println("Estimated flight duration is 3 hours");
    }
}
