package com.java.method.internal;

public class Flower extends Plant {
    public Flower() {
        System.out.println("flower is starting to bloom");
    }

    @Override
    public void grow() {
        System.out.println("flower is blooming beautifully");
    }

    public void smell() {
        System.out.println("flower is spreading fragrance");
    }
}
