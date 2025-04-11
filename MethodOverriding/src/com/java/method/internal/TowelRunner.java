package com.java.method.internal;

public class TowelRunner {
    public static void main(String[] args) {
        Towel t = new Towel();
        t.dry();

        Towel mt = new MicrofiberTowel();
        mt.dry();

        MicrofiberTowel microfiber = new MicrofiberTowel();
        microfiber.dry();
        microfiber.fold();
    }
}
