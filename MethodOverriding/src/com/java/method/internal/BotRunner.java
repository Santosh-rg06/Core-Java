package com.java.method.internal;

public class BotRunner {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.operate();

        Machine r = new Robot();
        r.operate();

        Robot robot = new Robot();
        robot.operate();
        robot.analyze();
    }
}
