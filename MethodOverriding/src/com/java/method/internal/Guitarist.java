package com.java.method.internal;

public class Guitarist extends Musician {
    public Guitarist() {
        System.out.println("Guitarist checks amplifier");
    }

    @Override
    public void play() {
        System.out.println("Strumming guitar chords");
    }

    public void solo() {
        System.out.println("Performing a guitar solo");
    }
}
