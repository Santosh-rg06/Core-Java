package com.xowrkz.oops.internal;

public class Camera {
    private String brand;
    private int megapixels;

    public Camera() {
        System.out.println("No-arg constructor of Camera");
    }

    public void capture() {
        System.out.println("Capturing photo using a basic camera.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public Camera(Camera ref) {
        this.brand = ref.brand;
        this.megapixels = ref.megapixels;
    }

    @Override
    public String toString() {
        return "Camera{brand='" + brand + "', megapixels=" + megapixels + "}";
    }
}
