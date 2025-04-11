package com.java.method.internal;

public class LifePolicyRunner {
    public static void main(String[] args) {
        LifeInsurance li = new LifeInsurance();
        li.insure();

        LifeInsurance tp = new TermPlan();
        tp.insure();

        TermPlan term = new TermPlan();
        term.insure();
        term.premiumDetails();
    }
}
