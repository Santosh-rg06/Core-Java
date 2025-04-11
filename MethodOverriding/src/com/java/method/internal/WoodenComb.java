package com.java.method.internal;

public class WoodenComb extends Comb {
    public WoodenComb() {
        System.out.println("Wooden comb is created");
    }

    @Override
    public void untangleHair() {
        System.out.println("Wooden comb gently untangles hair without static");
    }

    public void polish() {
        System.out.println("Wooden comb is polished with oil");
    }
}
