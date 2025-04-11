package com.java.method.internal;

public class CoffeeCup extends Cup {
    public CoffeeCup() {
        System.out.println("Coffee cup is ready to serve");
    }

    @Override
    public void fill() {
        System.out.println("Filling the coffee cup with hot coffee");
    }

    public void sip() {
        System.out.println("Sipping the delicious coffee");
    }
}
