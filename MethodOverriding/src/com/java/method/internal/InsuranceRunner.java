package com.java.method.internal;

public class InsuranceRunner {
    public static void main(String[] args) {
        TravelInsurance ti = new TravelInsurance();
        ti.cover();

        TravelInsurance ii = new InternationalInsurance();
        ii.cover();

        InternationalInsurance intl = new InternationalInsurance();
        intl.cover();
        intl.claimAssistance();
    }
}
