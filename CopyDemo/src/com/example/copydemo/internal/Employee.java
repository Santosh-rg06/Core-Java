package com.example.copydemo.internal;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Concrete methods
    public void showName() {
        System.out.println("Name: " + name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }

    // Abstract methods
    public abstract String getDepartment();
    public abstract double calculateSalary();
}
