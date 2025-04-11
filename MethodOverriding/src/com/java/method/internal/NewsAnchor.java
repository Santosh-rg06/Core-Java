package com.java.method.internal;

public class NewsAnchor extends Journalist {
    public NewsAnchor() {
        System.out.println("NewsAnchor is ready in the studio");
    }

    @Override
    public void report() {
        System.out.println("Live news broadcast underway");
    }

    public void interview() {
        System.out.println("Conducting live interview");
    }
}
