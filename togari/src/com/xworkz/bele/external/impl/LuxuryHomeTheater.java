package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.HomeTheater;

public class LuxuryHomeTheater implements HomeTheater {

    @Override
    public void turnOnProjector() {
        System.out.println("Turning on the 4K projector");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting surround sound system");
    }

    @Override
    public void streamMovie() {
        System.out.println("Streaming the latest movie online");
    }

    @Override
    public void dimLights() {
        System.out.println("Dimming the lights for cinema experience");
    }

    @Override
    public void enjoyShow() {
        System.out.println("Enjoying the movie with popcorn");
    }
}
