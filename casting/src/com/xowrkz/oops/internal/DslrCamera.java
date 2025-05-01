package com.xowrkz.oops.internal;

public class DslrCamera extends Camera {

    public DslrCamera() {
        System.out.println("No-arg constructor of DslrCamera");
    }

    @Override
    public void capture() {
        System.out.println("Capturing high-quality photo using DSLR.");
    }

    public void changeLens() {
        System.out.println("Changing the lens of the DSLR camera.");
    }
}
