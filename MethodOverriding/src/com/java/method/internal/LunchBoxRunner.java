package com.java.method.internal;

public class LunchBoxRunner {
    public static void main(String[] args) {
        LunchBox lb = new LunchBox();
        lb.packFood();

        LunchBox ilb = new InsulatedLunchBox();
        ilb.packFood();

        InsulatedLunchBox insulated = new InsulatedLunchBox();
        insulated.packFood();
        insulated.maintainTemperature();
    }
}
