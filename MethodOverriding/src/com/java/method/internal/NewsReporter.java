package com.java.method.internal;

public class NewsReporter extends Reporter {
    public NewsReporter() {
        System.out.println("NewsReporter goes live");
    }

    @Override
    public void report() {
        System.out.println("Broadcasting breaking news");
    }

    public void interview() {
        System.out.println("Interviewing eyewitness");
    }
}
