package com.java.method.internal;

public class KitchenRunner {
    public static void main(String[] args) {
        Appliance a = new Appliance();
        a.operate();

        Appliance m = new Microwave();
        m.operate();

        Microwave micro = new Microwave();
        micro.operate();
        micro.setTimer();
    }
}
