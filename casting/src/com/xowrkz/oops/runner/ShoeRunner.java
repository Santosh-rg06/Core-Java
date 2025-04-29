package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Shoe;
import com.xowrkz.oops.internal.SportsShoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe regularShoe = new Shoe();
        regularShoe.wear();

        Shoe sportsAsShoe = new SportsShoe(); // Upcasting
        sportsAsShoe.wear();

        System.out.println("**********");

        SportsShoe sporty = new SportsShoe();
        sporty.wear();
        sporty.provideGrip();

        Shoe s1 = new Shoe();
        s1.setBrand("Nike");
        s1.setSize(9);

        Shoe s2 = new Shoe(s1); // Copy constructor
        System.out.println(s2);
    }
}
