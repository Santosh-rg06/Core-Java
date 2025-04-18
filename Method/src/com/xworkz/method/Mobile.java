package com.xworkz.method;

import java.util.Objects;

public class Mobile {
    private String brand;
    private double price;
    private String model;
    private int storage;

    public Mobile(String brand, double price, String model, int storage) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.storage = storage;
    }

    public Mobile() {
    }

    public void setValues(String brand, double price, String model, int storage) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile mobile = (Mobile) obj;
            if (Objects.equals(this.brand, mobile.brand) &&
                    Objects.equals(this.price, mobile.price)) {
                System.out.println("mobile is matching..");
                return true;
            }
        }
        return false;
    }
}
