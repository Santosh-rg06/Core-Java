package com.java.method.internal;

public class BoardPlayRunner {
    public static void main(String[] args) {
        BoardGame bg = new BoardGame();
        bg.start();

        BoardGame sg = new StrategyGame();
        sg.start();

        StrategyGame strategy = new StrategyGame();
        strategy.start();
        strategy.calculateMove();
    }
}
