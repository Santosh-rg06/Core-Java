package com.java.method.internal;

public class PlayStation extends Console {
    public PlayStation() {
        System.out.println("playstation is loading the dashboard");
    }

    @Override
    public void startGame() {
        System.out.println("game is starting with advanced graphics");
    }

    public void loadProfile() {
        System.out.println("player profile loaded successfully");
    }
}
