package com.java.method.internal;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet h = new Helmet();
        h.protect();

        Helmet rh = new RacingHelmet();
        rh.protect();

        RacingHelmet racing = new RacingHelmet();
        racing.protect();
        racing.adjustVisor();
    }
}
