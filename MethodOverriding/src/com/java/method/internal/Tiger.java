package com.java.method.internal;

public class Tiger extends Animal {
    public Tiger() {
        System.out.println("tiger is now active in the jungle");
    }

    @Override
    public void sound() {
        System.out.println("tiger is growling loudly");
    }

    public void hunt() {
        System.out.println("tiger is hunting for prey");
    }
}
