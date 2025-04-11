package com.java.method.internal;

public class ChairRunner {
    public static void main(String[] args) {
        Chair c = new Chair();
        c.support();

        Chair oc = new OfficeChair();
        oc.support();

        OfficeChair office = new OfficeChair();
        office.support();
        office.adjustHeight();
    }
}
