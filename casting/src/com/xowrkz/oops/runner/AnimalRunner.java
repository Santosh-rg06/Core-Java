package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Animal;
import com.xowrkz.oops.internal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();

        Animal animalDog = new Dog(); // Upcasting
        animalDog.makeSound();

        System.out.println("**********");

        Dog realDog = new Dog();
        realDog.makeSound();
        realDog.fetchBall();

        Animal original = new Animal();
        original.setName("Buddy");
        original.setAge(5);

        Animal copy = new Animal(original);
        System.out.println(copy);
    }
}
