package com.java.method.internal;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.storeMoney();

        Wallet dw = new DigitalWallet();
        dw.storeMoney();

        DigitalWallet pay = new DigitalWallet();
        pay.storeMoney();
        pay.makePayment();
    }
}
