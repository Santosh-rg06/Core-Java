package com.example.copydemo.internal;

public abstract class Manager extends Employee {
    protected double baseSalary;

    public Manager(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    @Override
    public String getDepartment() {
        return "Management";
    }
}
