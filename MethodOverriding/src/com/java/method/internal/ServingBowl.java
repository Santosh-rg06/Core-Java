package com.java.method.internal;

public class ServingBowl extends Bowl {
    public ServingBowl() {
        System.out.println("Serving bowl created");
    }

    @Override
    public void holdFood() {
        System.out.println("Serving bowl used for serving dishes");
    }

    public void displayDish() {
        System.out.println("Dish presented beautifully in serving bowl");
    }
}
