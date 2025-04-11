package com.java.method.internal;

public class Cup {
    protected Cup() {
        System.out.println("Generic cup constructed");
    }

    public void fill() {
        System.out.println("Filling the cup with liquid");
    }
}
