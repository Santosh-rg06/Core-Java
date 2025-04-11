package com.java.method.internal;

public class InternationalInsurance extends TravelInsurance {
    public InternationalInsurance() {
        System.out.println("Creating an international travel insurance plan");
    }

    @Override
    public void cover() {
        System.out.println("Covers international travel incidents and medical support");
    }

    public void claimAssistance() {
        System.out.println("Providing 24/7 international claim assistance");
    }
}
