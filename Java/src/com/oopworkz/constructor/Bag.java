package com.oopworkz.constructor;

import java.util.Objects;

public class Bag {

    private String color;
    private int cost;
    private boolean isLaptopBag;
    private String brand;

    public Bag(String color, int cost, boolean isLaptopBag, String brand) {
        this.color = color;
        this.cost = cost;
        this.isLaptopBag = isLaptopBag;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", laptopBag=" + isLaptopBag +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bag) {
            Bag other = (Bag) obj;
            if (Objects.equals(this.color, other.color) &&
                    this.cost == other.cost) {
                System.out.println("Bag is matching..");
                return true;
            }
        }
        return false;
    }
}
