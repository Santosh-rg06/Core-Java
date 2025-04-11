package com.java.method.internal;

public class NewsChannel extends Channel {
    public NewsChannel() {
        System.out.println("news channel is covering headlines");
    }

    @Override
    public void broadcast() {
        System.out.println("live news is being broadcasted");
    }

    public void displayTicker() {
        System.out.println("scrolling news ticker at bottom");
    }
}
