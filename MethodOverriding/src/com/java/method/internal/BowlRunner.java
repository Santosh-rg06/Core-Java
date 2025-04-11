package com.java.method.internal;

public class BowlRunner {
    public static void main(String[] args) {
        Bowl b = new Bowl();
        b.holdFood();

        Bowl sb = new ServingBowl();
        sb.holdFood();

        ServingBowl serving = new ServingBowl();
        serving.holdFood();
        serving.displayDish();
    }
}
