package com.java.method.internal;

public class Coin {
    protected Coin() {
        System.out.println("Coin created");
    }

    public void getValue() {
        System.out.println("General coin value retrieved");
    }
}
