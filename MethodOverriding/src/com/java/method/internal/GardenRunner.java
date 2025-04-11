package com.java.method.internal;

public class GardenRunner {
    public static void main(String[] args) {
        Plant p = new Plant();
        p.grow();

        Plant f = new Flower();
        f.grow();

        Flower flower = new Flower();
        flower.grow();
        flower.smell();
    }
}
