package com.java.method.internal;

public class PlayRunner {
    public static void main(String[] args) {
        Console c = new Console();
        c.startGame();

        Console ps = new PlayStation();
        ps.startGame();

        PlayStation play = new PlayStation();
        play.startGame();
        play.loadProfile();
    }
}
