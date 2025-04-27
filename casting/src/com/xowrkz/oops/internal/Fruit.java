package com.xowrkz.oops.internal;

public class Fruit {
    private String color;
    private double weight;

    public Fruit() {
        System.out.println("No-arg constructor of Fruit");
    }

    public void taste() {
        System.out.println("Fruit tastes sweet or sour");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fruit(Fruit ref) {
        this.color = ref.color;
        this.weight = ref.weight;
    }

    @Override
    public String toString() {
        return "Fruit{color='" + color + "', weight=" + weight + "kg}";
    }
}
