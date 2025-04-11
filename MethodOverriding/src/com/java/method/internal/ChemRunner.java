package com.java.method.internal;

public class ChemRunner {
    public static void main(String[] args) {
        Chemical c = new Chemical();
        c.react();

        Chemical a = new Acid();
        a.react();

        Acid acid = new Acid();
        acid.react();
        acid.neutralize();
    }
}
