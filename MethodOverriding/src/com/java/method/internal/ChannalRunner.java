package com.java.method.internal;

public class ChannalRunner {
    public static void main(String[] args) {
        Reporter r = new Reporter();
        r.report();

        Reporter nr = new NewsReporter();
        nr.report();

        NewsReporter live = new NewsReporter();
        live.report();
        live.interview();
    }
}
