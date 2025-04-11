package com.java.method.internal;

public class NewsRunner {
    public static void main(String[] args) {
        Channel ch = new Channel();
        ch.broadcast();

        Channel nc = new NewsChannel();
        nc.broadcast();

        NewsChannel news = new NewsChannel();
        news.broadcast();
        news.displayTicker();
    }
}
