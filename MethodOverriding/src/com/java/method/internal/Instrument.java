package com.java.method.internal;

public class Instrument {
    protected Instrument() {
        System.out.println("creating a basic instrument");
    }

    public void play() {
        System.out.println("instrument is playing soft notes");
    }
}
