package com.java.method.internal;

public class PublicTransport {
    protected PublicTransport() {
        System.out.println("PublicTransport system initialized");
    }

    public void commute() {
        System.out.println("Using public transport to travel");
    }
}
