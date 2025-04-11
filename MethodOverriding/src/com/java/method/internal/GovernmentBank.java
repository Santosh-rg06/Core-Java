package com.java.method.internal;

public class GovernmentBank extends Bank {
    public GovernmentBank() {
        System.out.println("Government Bank initialized");
    }

    @Override
    public void provideService() {
        System.out.println("Government Bank provides subsidized and welfare services");
    }

    public void issueSubsidy() {
        System.out.println("Government Bank issues subsidy to eligible citizens");
    }
}
