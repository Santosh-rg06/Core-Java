package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Chair;
import com.xowrkz.oops.internal.OfficeChair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair basicChair = new Chair();
        basicChair.sit();

        Chair officeChairAsChair = new OfficeChair(); // Polymorphism
        officeChairAsChair.sit();

        System.out.println("**********");

        OfficeChair fullOfficeChair = new OfficeChair();
        fullOfficeChair.sit();
        fullOfficeChair.rotate();

        Chair ch1 = new Chair();
        ch1.setMaterial("Plastic");
        ch1.setLegs(4);

        Chair ch2 = new Chair(ch1);
        System.out.println(ch2);
    }
}
