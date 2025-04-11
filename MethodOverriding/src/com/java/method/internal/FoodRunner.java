package com.java.method.internal;

public class FoodRunner {
    public static void main(String[] args) {
        Food f = new Food();
        f.taste();

        Food p = new Pizza();
        p.taste();

        Pizza pizza = new Pizza();
        pizza.taste();
        pizza.serve();
    }
}
