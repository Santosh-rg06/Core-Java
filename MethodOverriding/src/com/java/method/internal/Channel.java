package com.java.method.internal;

public class Channel {
    protected Channel() {
        System.out.println("channel is now live");
    }

    public void broadcast() {
        System.out.println("broadcasting general content");
    }
}
