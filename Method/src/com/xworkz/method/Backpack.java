package com.xworkz.method;

import java.util.Objects;

public class Backpack {

    private String color;
    private int cost;
    private boolean isLaptopBag;
    private String brand;

    public Backpack(String color, int cost, boolean isLaptopBag, String brand) {
        this.color = color;
        this.cost = cost;
        this.isLaptopBag = isLaptopBag;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "color='" + color + ", cost=" + cost + ", laptop Bag=" + isLaptopBag + ", brand='" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Backpack) {
            Backpack other = (Backpack) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.cost, other.cost)) {
                System.out.println("Bottle is matching..");
                return true;
            }
        }
        return false;
    }
}
