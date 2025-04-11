package com.java.method.internal;

public class StreamRunner {
    public static void main(String[] args) {
        Stream s = new Stream();
        s.play();

        Stream ls = new LiveStream();
        ls.play();

        LiveStream live = new LiveStream();
        live.play();
        live.chatFeature();
    }
}
