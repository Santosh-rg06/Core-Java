package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Fruit;
import com.xowrkz.oops.internal.Apple;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.taste();

        Fruit appleAsFruit = new Apple(); // Upcasting
        appleAsFruit.taste();

        System.out.println("**********");

        Apple apple = new Apple();
        apple.taste();
        apple.makeJuice();

        Fruit f1 = new Fruit();
        f1.setColor("Red");
        f1.setWeight(0.2);

        Fruit f2 = new Fruit(f1);
        System.out.println(f2);
    }
}
