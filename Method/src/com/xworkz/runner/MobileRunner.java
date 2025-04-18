package com.xworkz.runner;

import com.xworkz.method.Mobile;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile("Samsung", 29999.0, "Galaxy A52", 128);
        Mobile mobile2 = new Mobile("Samsung", 29999.0, "Galaxy A52", 128); // same brand & price
        Mobile mobile3 = new Mobile("Apple", 99999.0, "iPhone 13", 256);

        boolean match = mobile1.equals(mobile2);     // true
        boolean notMatch = mobile3.equals(mobile2);  // false

        System.out.println("mobile match: " + match);
        System.out.println("mobile not match: " + notMatch);

        System.out.println(mobile1);
        System.out.println(mobile2);
        System.out.println(mobile3);

        System.out.println("================");

        Mobile mobileA = new Mobile();
        mobileA.setValues("OnePlus", 34999.0, "Nord CE 3", 128);

        Mobile mobileB = new Mobile();
        mobileB.setValues("OnePlus", 34999.0, "Nord CE 3", 128); // same as A

        Mobile mobileC = new Mobile();
        mobileC.setValues("Xiaomi", 17999.0, "Redmi Note 12", 128);

        boolean match2 = mobileA.equals(mobileB);     // true
        boolean notMatch2 = mobileC.equals(mobileB);  // false

        System.out.println("mobile match (setter): " + match2);
        System.out.println("mobile not match (setter): " + notMatch2);

        System.out.println(mobileA);
        System.out.println(mobileB);
        System.out.println(mobileC);
    }
}
