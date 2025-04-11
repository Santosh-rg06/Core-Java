package com.java.method.internal;

public class OfficeChair extends Chair {
    public OfficeChair() {
        System.out.println("Office chair is ready");
    }

    @Override
    public void support() {
        System.out.println("Office chair provides ergonomic support");
    }

    public void adjustHeight() {
        System.out.println("Adjusting the height of the office chair");
    }
}
