package com.java.method.internal;

public class HealthCoverRunner {
    public static void main(String[] args) {
        HealthInsurance hi = new HealthInsurance();
        hi.benefits();

        HealthInsurance fhp = new FamilyHealthPlan();
        fhp.benefits();

        FamilyHealthPlan plan = new FamilyHealthPlan();
        plan.benefits();
        plan.addDependent();
    }
}
