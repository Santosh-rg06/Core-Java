package com.java.method.internal;

public class StrategyGame extends BoardGame {
    public StrategyGame() {
        System.out.println("Preparing a strategy-based board game");
    }

    @Override
    public void start() {
        System.out.println("Starting a complex strategy game with rules");
    }

    public void calculateMove() {
        System.out.println("Calculating the best possible move");
    }
}
