package com.xworkz.runner;

import com.xworkz.method.Bottle;

public class BottleRunner {
    public static void main(String[] args) {

        Bottle bottle1 = new Bottle("Red", 20, "Bisleri", 1.0);
        Bottle bottle2 = new Bottle("Black", 15, "Kinley", 0.5);
        Bottle bottle3 = new Bottle("Black", 15, "Kinley", 0.5);

        boolean match = bottle1.equals(bottle2);
        boolean notMatch = bottle3.equals(bottle2);

        System.out.println("bottle match: " + match);
        System.out.println("bottle not match: " + notMatch);

        System.out.println(bottle1);
        System.out.println(bottle2);
        System.out.println(bottle3);

        System.out.println("================");


        Bottle bottleA = new Bottle();
        bottleA.setValues("Blue", 30, "Aquafina", 0.7);
        Bottle bottleB = new Bottle();
        bottleB.setValues("Green", 25, "Evian", 0.8);
        Bottle bottleC = new Bottle();
        bottleC.setValues("Green", 25, "Evian", 0.8);

        boolean match2 = bottleA.equals(bottleB);
        boolean notMatch2 = bottleC.equals(bottleB);

        System.out.println("bottle match (setter): " + match2);
        System.out.println("bottle not match (setter): " + notMatch2);

        System.out.println(bottleA);
        System.out.println(bottleB);
        System.out.println(bottleC);
    }
}

