package com.java.method.internal;

public class Sword extends Metal {
    public Sword() {
        System.out.println("sword forging has started");
    }

    @Override
    public void shape() {
        System.out.println("sword is being sharpened to perfection");
    }

    public void polish() {
        System.out.println("sword is polished and shining bright");
    }
}
