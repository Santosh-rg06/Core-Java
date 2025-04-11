package com.java.method.internal;

public class Pizza extends Food {
    public Pizza() {
        System.out.println("baking a cheesy pizza");
    }

    @Override
    public void taste() {
        System.out.println("pizza tastes spicy and cheesy");
    }

    public void serve() {
        System.out.println("pizza served with extra toppings");
    }
}
