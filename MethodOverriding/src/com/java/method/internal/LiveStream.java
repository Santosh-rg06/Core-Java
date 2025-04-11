package com.java.method.internal;

public class LiveStream extends Stream {
    public LiveStream() {
        System.out.println("Live stream is now active");
    }

    @Override
    public void play() {
        System.out.println("Streaming live content in real time");
    }

    public void chatFeature() {
        System.out.println("Live chat is enabled for viewers");
    }
}
