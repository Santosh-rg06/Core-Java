package com.xowrkz.oops.internal;

public class Train {
    private String name;
    private int coaches;

    public Train() {
        System.out.println("No-arg constructor of Train");
    }

    public void run() {
        System.out.println("Train is running on the track");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoaches(int coaches) {
        this.coaches = coaches;
    }

    public Train(Train ref) {
        this.name = ref.name;
        this.coaches = ref.coaches;
    }

    @Override
    public String toString() {
        return "Train{name='" + name + "', coaches=" + coaches + "}";
    }
}
