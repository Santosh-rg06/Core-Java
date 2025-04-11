package com.java.method.internal;

public class Bottle {
    protected Bottle() {
        System.out.println("Bottle object created");
    }

    public void fill() {
        System.out.println("Filling the bottle with liquid");
    }

    public void drink() {
        System.out.println("Drinking from the bottle");
    }
}
