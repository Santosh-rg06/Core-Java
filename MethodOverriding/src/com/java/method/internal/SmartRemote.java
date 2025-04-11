package com.java.method.internal;

public class SmartRemote extends Remote {
    public SmartRemote() {
        System.out.println("Smart remote is initialized");
    }

    @Override
    public void powerButton() {
        System.out.println("Smart remote turns on the smart device");
    }

    public void voiceControl() {
        System.out.println("Smart remote is using voice control feature");
    }
}
