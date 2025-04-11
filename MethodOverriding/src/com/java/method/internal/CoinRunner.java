package com.java.method.internal;

public class CoinRunner {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.getValue();

        Coin gold = new GoldCoin();
        gold.getValue();

        GoldCoin g = new GoldCoin();
        g.getValue();
        g.polish();
    }
}
