package com.java.method.internal;

public class Subscription {
    protected Subscription() {
        System.out.println("Subscription is activated");
    }

    public void accessContent() {
        System.out.println("Basic content is accessible with this subscription");
    }
}
