package com.java.method.internal;

public class LockRunner {
    public static void main(String[] args) {
        Lock l = new Lock();
        l.secure();

        Lock dl = new DigitalLock();
        dl.secure();

        DigitalLock digital = new DigitalLock();
        digital.secure();
        digital.unlockWithCode();
    }
}
