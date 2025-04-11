package com.java.method.internal;

public class MetroTrain extends PublicTransport {
    public MetroTrain() {
        System.out.println("MetroTrain is scheduled");
    }

    @Override
    public void commute() {
        System.out.println("Commuting using metro train service");
    }

    public void checkTiming() {
        System.out.println("Next train arrives in 5 minutes");
    }
}
