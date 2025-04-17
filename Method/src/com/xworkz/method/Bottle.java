package com.xworkz.method;

import java.util.Objects;

public class Bottle {
    private String color;
    private int cost;
    private String brand;
    private double capacity;

    public Bottle(String color, int cost, String brand, double capacity) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.capacity = capacity;
    }

    public Bottle() {
    }

    public void setValues(String color, int cost, String brand, double capacity) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "Bottle{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Bottle) {
            Bottle bottle = (Bottle) anything;
            if (Objects.equals(this.color, bottle.color) &&
                    Objects.equals(this.cost, bottle.cost)) {
                System.out.println("bottle is matching..");
                return true;
            }
        }
        return false;
    }
}
