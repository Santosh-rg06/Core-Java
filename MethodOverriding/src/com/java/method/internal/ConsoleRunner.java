package com.java.method.internal;

public class ConsoleRunner {
    public static void main(String[] args) {
        VideoGame vg = new VideoGame();
        vg.play();

        VideoGame rg = new RacingGame();
        rg.play();

        RacingGame race = new RacingGame();
        race.play();
        race.drift();
    }
}
