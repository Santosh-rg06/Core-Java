package com.java.method.internal;

public class Cricket extends Game {
    public Cricket() {
        System.out.println("setting up a cricket match");
    }

    @Override
    public void play() {
        System.out.println("cricket match starts with a toss");
    }

    public void score() {
        System.out.println("team scored 250 runs");
    }
}
