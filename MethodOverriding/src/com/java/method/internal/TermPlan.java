package com.java.method.internal;

public class TermPlan extends LifeInsurance {
    public TermPlan() {
        System.out.println("TermPlan selected with fixed tenure");
    }

    @Override
    public void insure() {
        System.out.println("Provides high life coverage for a specific term");
    }

    public void premiumDetails() {
        System.out.println("Monthly premium calculated for term plan");
    }
}
