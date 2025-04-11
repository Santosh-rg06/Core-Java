package com.java.method.internal;

public class MicrofiberTowel extends Towel {
    public MicrofiberTowel() {
        System.out.println("Microfiber towel is created");
    }

    @Override
    public void dry() {
        System.out.println("Microfiber towel dries quickly and absorbs more");
    }

    public void fold() {
        System.out.println("Folding the microfiber towel");
    }
}
