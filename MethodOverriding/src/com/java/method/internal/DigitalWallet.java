package com.java.method.internal;

public class DigitalWallet extends Wallet {
    public DigitalWallet() {
        System.out.println("Digital wallet initialized");
    }

    @Override
    public void storeMoney() {
        System.out.println("Adding balance to digital wallet");
    }

    public void makePayment() {
        System.out.println("Payment made through digital wallet");
    }
}
