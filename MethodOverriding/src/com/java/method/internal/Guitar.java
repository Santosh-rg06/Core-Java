package com.java.method.internal;

public class Guitar extends Instrument {
    public Guitar() {
        System.out.println("tuning the guitar strings");
    }

    @Override
    public void play() {
        System.out.println("guitar is strumming a melody");
    }

    public void genre() {
        System.out.println("guitar used in rock music");
    }
}
