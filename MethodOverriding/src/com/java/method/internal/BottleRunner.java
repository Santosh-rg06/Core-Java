package com.java.method.internal;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle b = new Bottle();
        b.fill();
        b.drink();

        System.out.println("----");

        Bottle wb = new WaterBottle();
        wb.fill();
        wb.drink();

        System.out.println("----");

        WaterBottle realWB = new WaterBottle();
        realWB.fill();
        realWB.drink();
        realWB.chill();
    }
}
