package com.xowrkz.oops.internal;

public class Bottle {
    private String material;
    private int capacity;

    public Bottle() {
        System.out.println("No-arg constructor of Bottle");
    }

    public void storeLiquid() {
        System.out.println("Bottle stores water or any liquid.");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Bottle(Bottle ref) {
        this.material = ref.material;
        this.capacity = ref.capacity;
    }

    @Override
    public String toString() {
        return "Bottle{material='" + material + "', capacity=" + capacity + "ml}";
    }
}
