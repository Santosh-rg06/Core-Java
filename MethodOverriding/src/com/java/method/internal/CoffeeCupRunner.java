package com.java.method.internal;

public class CoffeeCupRunner {
    public static void main(String[] args) {
        Cup c = new Cup();
        c.fill();

        Cup cc = new CoffeeCup();
        cc.fill();

        CoffeeCup coffee = new CoffeeCup();
        coffee.fill();
        coffee.sip();
    }
}
