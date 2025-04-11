package com.java.method.internal;

public class BankAccountRunner {
    public static void main(String[] args) {
        SingleAccountHolder sah = new SingleAccountHolder();
        sah.accountType();

        SingleAccountHolder pah = new PremiumAccountHolder();
        pah.accountType();

        PremiumAccountHolder premium = new PremiumAccountHolder();
        premium.accountType();
        premium.accessLounge();
    }
}
