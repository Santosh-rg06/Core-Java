package com.java.method.internal;

public class MetroRunner {
    public static void main(String[] args) {
        PublicTransport pt = new PublicTransport();
        pt.commute();

        PublicTransport mt = new MetroTrain();
        mt.commute();

        MetroTrain metro = new MetroTrain();
        metro.commute();
        metro.checkTiming();
    }
}
