package com.java.method.internal;

public class TechRunner {
    public static void main(String[] args) {
        Technology t = new Technology();
        t.process();

        Technology a = new AI();
        a.process();

        AI ai = new AI();
        ai.process();
        ai.learn();
    }
}
