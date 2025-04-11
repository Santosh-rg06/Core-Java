package com.java.method.internal;

public class StudioRunner {
    public static void main(String[] args) {
        Tailor t = new Tailor();
        t.stitch();

        Tailor d = new Designer();
        d.stitch();

        Designer des = new Designer();
        des.stitch();
        des.style();
    }
}
