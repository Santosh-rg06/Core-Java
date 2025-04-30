package com.xowrkz.oops.internal;

public class Chair {
    private String material;
    private int legs;

    public Chair() {
        System.out.println("No-arg constructor of Chair");
    }

    public void sit() {
        System.out.println("You can sit on a basic chair.");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Chair(Chair ref) {
        this.material = ref.material;
        this.legs = ref.legs;
    }

    @Override
    public String toString() {
        return "Chair{material='" + material + "', legs=" + legs + "}";
    }
}
