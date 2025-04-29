package com.xowrkz.oops.internal;

public class Shoe {
    private String brand;
    private int size;

    public Shoe() {
        System.out.println("No-arg constructor of Shoe");
    }

    public void wear() {
        System.out.println("Wearing a regular shoe.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Shoe(Shoe ref) {
        this.brand = ref.brand;
        this.size = ref.size;
    }

    @Override
    public String toString() {
        return "Shoe{brand='" + brand + "', size=" + size + "}";
    }
}
