package com.java.method.internal;

public class Baker extends Chef {
    public Baker() {
        System.out.println("setting oven temperature");
    }

    @Override
    public void cook() {
        System.out.println("baker is baking fresh bread");
    }

    public void bakeCake() {
        System.out.println("baker is decorating a chocolate cake");
    }
}
