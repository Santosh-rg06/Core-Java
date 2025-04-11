package com.java.method.internal;

public class FamilyHealthPlan extends HealthInsurance {
    public FamilyHealthPlan() {
        System.out.println("FamilyHealthPlan initiated for multiple members");
    }

    @Override
    public void benefits() {
        System.out.println("Covers medical costs for entire family");
    }

    public void addDependent() {
        System.out.println("Adding a dependent to the health plan");
    }
}
