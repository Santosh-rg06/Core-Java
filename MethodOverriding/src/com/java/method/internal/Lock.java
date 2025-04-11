package com.java.method.internal;

public class Lock {
    protected Lock() {
        System.out.println("Lock is initialized");
    }

    public void secure() {
        System.out.println("Lock is used to secure doors");
    }
}
