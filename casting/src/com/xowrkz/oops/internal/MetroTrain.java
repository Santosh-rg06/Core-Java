package com.xowrkz.oops.internal;

public class MetroTrain extends Train {

    public MetroTrain() {
        System.out.println("No-arg constructor of MetroTrain");
    }

    @Override
    public void run() {
        System.out.println("MetroTrain is running smoothly in the city");
    }

    public void announceNextStation() {
        System.out.println("Announcing next station: Please get ready to disembark");
    }
}
