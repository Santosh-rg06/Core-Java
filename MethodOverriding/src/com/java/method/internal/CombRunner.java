package com.java.method.internal;

public class CombRunner {
    public static void main(String[] args) {
        Comb c = new Comb();
        c.untangleHair();

        Comb wc = new WoodenComb();
        wc.untangleHair();

        WoodenComb wooden = new WoodenComb();
        wooden.untangleHair();
        wooden.polish();
    }
}
