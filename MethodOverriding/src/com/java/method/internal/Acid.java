package com.java.method.internal;

public class Acid extends Chemical {
    public Acid() {
        System.out.println("acid solution is ready for testing");
    }

    @Override
    public void react() {
        System.out.println("acid is showing strong reaction");
    }


    public void neutralize() {
        System.out.println("acid is neutralized with a base");
    }
}
