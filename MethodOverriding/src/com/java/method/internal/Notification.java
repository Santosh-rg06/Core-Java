package com.java.method.internal;

public class Notification {
    protected Notification() {
        System.out.println("Notification base class created");
    }

    public void send() {
        System.out.println("Sending a generic notification");
    }
}
