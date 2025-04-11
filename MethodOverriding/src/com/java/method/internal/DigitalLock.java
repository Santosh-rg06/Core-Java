package com.java.method.internal;

public class DigitalLock extends Lock {
    public DigitalLock() {
        System.out.println("Digital lock is initialized");
    }

    @Override
    public void secure() {
        System.out.println("Digital lock secures with a password");
    }

    public void unlockWithCode() {
        System.out.println("Digital lock is unlocked using a passcode");
    }
}
