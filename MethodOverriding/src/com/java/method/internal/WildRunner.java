package com.java.method.internal;

public class WildRunner {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Animal t = new Tiger();
        t.sound();

        Tiger tiger = new Tiger();
        tiger.sound();
        tiger.hunt();
    }
}
