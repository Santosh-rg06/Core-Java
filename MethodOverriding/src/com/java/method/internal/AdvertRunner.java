package com.java.method.internal;

public class AdvertRunner {
    public static void main(String[] args) {
        Advert ad = new Advert();
        ad.display();

        Advert digital = new DigitalAdvert();
        digital.display();

        DigitalAdvert dAd = new DigitalAdvert();
        dAd.display();
        dAd.trackEngagement();
    }
}
