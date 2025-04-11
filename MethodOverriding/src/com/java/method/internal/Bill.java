package com.java.method.internal;

public class Bill {
    protected Bill() {
        System.out.println("Bill is being generated");
    }

    public void printBill() {
        System.out.println("Printing the general bill");
    }
}
