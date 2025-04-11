package com.java.method.internal;

public class Mobile extends Device {
    public Mobile() {
        System.out.println("activating mobile features");
    }

    @Override
    public void start() {
        System.out.println("mobile is starting with fingerprint scan");
    }

    public void call() {
        System.out.println("making a phone call");
    }
}
