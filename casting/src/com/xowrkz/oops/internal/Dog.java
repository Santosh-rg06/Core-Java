package com.xowrkz.oops.internal;

public class Dog extends Animal {

    public Dog() {
        System.out.println("No-arg constructor of Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void fetchBall() {
        System.out.println("Dog is fetching the ball...");
    }
}
