package com.java.method.internal;

public class Plant {
    private String species;
    private double height;
    public Plant() {
        System.out.println("no-arg constructor of Plant");
    }

    public void grow() {
        System.out.println("Running grow() in Plant");
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Plant(Plant ref) {
        this.species = ref.species;
        this.height = ref.height;
    }

    @Override
    public String toString() {
        return "Species: " + species + ", Height: " + height + " cm";
    }

}
