package com.java.method.internal;

public class GameRunner {
    public static void main(String[] args) {
        Game g = new Game();
        g.play();

        Game c = new Cricket();
        c.play();

        Cricket cricket = new Cricket();
        cricket.play();
        cricket.score();
    }
}
