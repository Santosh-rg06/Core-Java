package com.java.method.internal;

public class Bank {
    protected Bank() {
        System.out.println("Bank account created");
    }

    public void provideService() {
        System.out.println("Bank provides financial services");
    }
}
