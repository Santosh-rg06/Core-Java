package com.java.method.internal;

public class GoldCoin extends Coin {
    public GoldCoin() {
        System.out.println("Gold coin minted");
    }

    @Override
    public void getValue() {
        System.out.println("Gold coin has high market value");
    }

    public void polish() {
        System.out.println("Polishing the gold coin");
    }
}
