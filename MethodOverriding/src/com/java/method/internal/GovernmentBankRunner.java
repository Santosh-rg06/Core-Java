package com.java.method.internal;

public class GovernmentBankRunner {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.provideService();

        Bank gb = new GovernmentBank();
        gb.provideService();

        GovernmentBank gov = new GovernmentBank();
        gov.provideService();
        gov.issueSubsidy();
    }
}
