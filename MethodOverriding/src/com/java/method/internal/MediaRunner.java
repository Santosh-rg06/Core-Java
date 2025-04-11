package com.java.method.internal;

public class MediaRunner {
    public static void main(String[] args) {
        Journalist j = new Journalist();
        j.report();

        Journalist n = new NewsAnchor();
        n.report();

        NewsAnchor na = new NewsAnchor();
        na.report();
        na.interview();
    }
}
