package com.java.method.internal;

public class PhotoRunner {
    public static void main(String[] args) {
        Camera c = new Camera();
        c.capture();

        Camera d = new DSLR();
        d.capture();

        DSLR dslr = new DSLR();
        dslr.capture();
        dslr.changeLens();
    }
}
