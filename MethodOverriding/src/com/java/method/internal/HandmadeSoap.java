package com.java.method.internal;

public class HandmadeSoap extends Soap {
    public HandmadeSoap() {
        System.out.println("Handmade soap is crafted");
    }

    @Override
    public void clean() {
        System.out.println("Handmade soap cleans gently and naturally");
    }

    public void fragrance() {
        System.out.println("Handmade soap has a pleasant fragrance");
    }
}
