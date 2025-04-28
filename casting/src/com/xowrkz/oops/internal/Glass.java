package com.xowrkz.oops.internal;

public class Glass {
    private String material;
    private double thickness;

    public Glass() {
        System.out.println("No-arg constructor of Glass");
    }

    public void reflect() {
        System.out.println("Glass reflects light");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public Glass(Glass ref) {
        this.material = ref.material;
        this.thickness = ref.thickness;
    }

    @Override
    public String toString() {
        return "Glass{material='" + material + "', thickness=" + thickness + " mm}";
    }
}
