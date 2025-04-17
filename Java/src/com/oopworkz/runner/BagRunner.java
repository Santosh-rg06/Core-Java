package com.oopworkz.runner;

import com.oopworkz.constructor.Bag;

public class BagRunner {
    public static void main(String[] args) {

        Bag b1 = new Bag("Red", 20, true, "Lenovo");
        Bag b2 = new Bag("Black", 15, false, "Hyder");
        Bag b3 = new Bag("Black", 15, false, "Hyder");

        System.out.println("Bag 1: " + b1);
        System.out.println("Bag 2: " + b2);
        System.out.println("Bag 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);

        System.out.println("Bag match: " + bMatch);
        System.out.println("Bag not match: " + bNotMatch);
    }
}
