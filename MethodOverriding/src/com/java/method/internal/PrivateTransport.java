package com.java.method.internal;

public class PrivateTransport {
    protected PrivateTransport() {
        System.out.println("Private transport selected");
    }

    public void travel() {
        System.out.println("Traveling via private transport");
    }
}
