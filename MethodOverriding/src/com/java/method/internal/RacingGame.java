package com.java.method.internal;

public class RacingGame extends VideoGame {
    public RacingGame() {
        System.out.println("RacingGame is loading with cars and tracks");
    }

    @Override
    public void play() {
        System.out.println("Playing a fast-paced racing game");
    }

    public void drift() {
        System.out.println("Executing a high-speed drift!");
    }
}
