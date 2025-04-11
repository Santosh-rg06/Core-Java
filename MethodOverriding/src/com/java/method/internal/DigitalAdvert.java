package com.java.method.internal;

public class DigitalAdvert extends Advert {
    public DigitalAdvert() {
        System.out.println("Digital advertisement is live");
    }

    @Override
    public void display() {
        System.out.println("Displaying digital ad on social media platforms");
    }

    public void trackEngagement() {
        System.out.println("Tracking clicks and views on digital ad");
    }
}
