package com.java.method.internal;

public class SportsSandal extends Sandal {
    public SportsSandal() {
        System.out.println("Sports sandal with extra grip created");
    }

    @Override
    public void wear() {
        System.out.println("Wearing sports sandals for active use");
    }

    public void fasten() {
        System.out.println("Fastening the adjustable straps");
    }
}
