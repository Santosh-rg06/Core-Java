package com.example.copydemo.runner;

import com.example.copydemo.external.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        dog1.sound();

        Dog dog2 = new Dog(dog1);
        dog2.sound();
    }
}
