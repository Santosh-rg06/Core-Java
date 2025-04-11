package com.java.method.internal;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket j = new Jacket();
        j.wear();

        Jacket rj = new RainJacket();
        rj.wear();

        RainJacket rain = new RainJacket();
        rain.wear();
        rain.fold();
    }
}
