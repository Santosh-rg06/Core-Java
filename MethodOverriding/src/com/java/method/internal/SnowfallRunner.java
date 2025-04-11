package com.java.method.internal;

public class SnowfallRunner {
    public static void main(String[] args) {
        Snowfall s = new Snowfall();
        s.intensity();

        Snowfall h = new HeavySnowfall();
        h.intensity();

        HeavySnowfall hs = new HeavySnowfall();
        hs.intensity();
        hs.issueAlert();
    }
}
