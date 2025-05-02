package com.xowrkz.oops.internal;

public class Pen {
    private String brand;
    private String inkColor;

    public Pen() {
        System.out.println("No-arg constructor of Pen");
    }

    public void write() {
        System.out.println("Writing with a regular pen.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public Pen(Pen ref) {
        this.brand = ref.brand;
        this.inkColor = ref.inkColor;
    }

    @Override
    public String toString() {
        return "Pen{brand='" + brand + "', inkColor='" + inkColor + "'}";
    }
}
