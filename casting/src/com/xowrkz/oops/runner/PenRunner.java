package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Pen;
import com.xowrkz.oops.internal.FountainPen;

public class PenRunner {
    public static void main(String[] args) {
        Pen regularPen = new Pen();
        regularPen.write();

        Pen penAsFountain = new FountainPen(); // Polymorphism
        penAsFountain.write();

        System.out.println("**********");

        FountainPen fountain = new FountainPen();
        fountain.write();
        fountain.refillInk();

        Pen p1 = new Pen();
        p1.setBrand("Parker");
        p1.setInkColor("Blue");

        Pen p2 = new Pen(p1); // Copy constructor
        System.out.println(p2);
    }
}
