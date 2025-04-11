package com.java.method.internal;

public class SiteRunner {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.build();

        Builder m = new Mason();
        m.build();

        Mason mason = new Mason();
        mason.build();
        mason.cement();
    }
}
