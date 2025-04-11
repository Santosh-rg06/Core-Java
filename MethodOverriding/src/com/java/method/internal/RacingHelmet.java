package com.java.method.internal;

public class RacingHelmet extends Helmet {
    public RacingHelmet() {
        System.out.println("Racing helmet is manufactured");
    }

    @Override
    public void protect() {
        System.out.println("Racing helmet offers advanced protection");
    }

    public void adjustVisor() {
        System.out.println("Visor is adjusted for clear vision");
    }
}
