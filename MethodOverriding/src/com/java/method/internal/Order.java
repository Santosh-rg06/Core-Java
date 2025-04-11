package com.java.method.internal;

public class Order {
    protected Order() {
        System.out.println("Base Order created");
    }

    public void processOrder() {
        System.out.println("Processing a generic order");
    }
}
