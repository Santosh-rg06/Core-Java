package com.java.method.internal;

public class Payment {
    protected Payment() {
        System.out.println("Payment process started");
    }

    public void processTransaction() {
        System.out.println("Processing generic payment transaction");
    }
}
