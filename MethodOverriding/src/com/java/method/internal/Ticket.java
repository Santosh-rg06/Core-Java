package com.java.method.internal;

public class Ticket {
    protected Ticket() {
        System.out.println("Ticket class created");
    }

    public void displayDetails() {
        System.out.println("Generic ticket details");
    }
}
