package com.example.copydemo.external;

import com.example.copydemo.internal.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog(Dog other) {
        super(other.name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says Woof!");
    }
}
