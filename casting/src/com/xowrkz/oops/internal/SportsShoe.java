package com.xowrkz.oops.internal;

public class SportsShoe extends Shoe {

    public SportsShoe() {
        System.out.println("No-arg constructor of SportsShoe");
    }

    @Override
    public void wear() {
        System.out.println("Wearing a sports shoe for running and training.");
    }

    public void provideGrip() {
        System.out.println("SportsShoe provides extra grip and comfort.");
    }
}
