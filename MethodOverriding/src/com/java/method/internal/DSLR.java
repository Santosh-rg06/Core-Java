package com.java.method.internal;

public class DSLR extends Camera {
    public DSLR() {
        System.out.println("DSLR camera is now active");
    }

    @Override
    public void capture() {
        System.out.println("capturing image in high-resolution mode");
    }

    public void changeLens() {
        System.out.println("lens has been changed successfully");
    }
}
