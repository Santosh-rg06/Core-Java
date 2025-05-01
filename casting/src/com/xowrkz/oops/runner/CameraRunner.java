package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Camera;
import com.xowrkz.oops.internal.DslrCamera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera basicCam = new Camera();
        basicCam.capture();

        Camera camAsDslr = new DslrCamera(); // Polymorphism
        camAsDslr.capture();

        System.out.println("**********");

        DslrCamera dslr = new DslrCamera();
        dslr.capture();
        dslr.changeLens();

        Camera c1 = new Camera();
        c1.setBrand("Canon");
        c1.setMegapixels(24);

        Camera c2 = new Camera(c1); // Copy constructor
        System.out.println(c2);
    }
}
