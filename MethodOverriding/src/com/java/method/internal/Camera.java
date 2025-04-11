package com.java.method.internal;

public class Camera {
    protected Camera() {
        System.out.println("basic camera initialized");
    }
    public void capture() {
        System.out.println("capturing image in auto mode");
    }
}
