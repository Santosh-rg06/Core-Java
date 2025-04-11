package com.java.method.internal;

public class Magazine extends Publication {
    public Magazine() {
        System.out.println("Magazine issued");
    }

    @Override
    public void publish() {
        System.out.println("Magazine: Monthly articles, photos, and editorials");
    }

    public void displayCoverStory() {
        System.out.println("Cover story: Technology trends of the year");
    }
}
