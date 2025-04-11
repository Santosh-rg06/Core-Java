package com.java.method.internal;

public class Wallet {
    protected Wallet() {
        System.out.println("Wallet created");
    }

    public void storeMoney() {
        System.out.println("Storing physical cash in wallet");
    }
}
