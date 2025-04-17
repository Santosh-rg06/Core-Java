package com.xworkz.runner;

import com.xworkz.method.Backpack;

public class BackpackRunner {
    public static void main(String[] args) {

        Backpack b1 = new Backpack("Red", 20, true, "Lenovo");
        Backpack b2 = new Backpack("Black", 15, false, "Hyder");
        Backpack b3 = new Backpack("Black", 15, false, "Hyder");

        System.out.println("Backpack 1: " + b1);
        System.out.println("Backpack 2: " + b2);
        System.out.println("Backpack 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Backpack match: " + bMatch);
        System.out.println("Backpack not match: " + bNotMatch);
    }
}
