package com.xowrkz.oops.internal;

public class Appliance {
    private String brand;
    private double power;

    public Appliance() {
        System.out.println("No-arg constructor of Appliance");
    }

    public void turnOn() {
        System.out.println("Appliance is now ON");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Appliance(Appliance ref) {
        this.brand = ref.brand;
        this.power = ref.power;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Power: " + power + "W";
    }
}
