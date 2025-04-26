package com.xowrkz.oops.internal;

public class Animal {
    private String name;
    private int age;

    public Animal() {
        System.out.println("No-arg constructor of Animal");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(Animal ref) {
        this.name = ref.name;
        this.age = ref.age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}
