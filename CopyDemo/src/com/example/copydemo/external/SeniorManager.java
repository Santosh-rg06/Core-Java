package com.example.copydemo.external;

import com.example.copydemo.internal.Manager;

public class SeniorManager extends Manager {
    private double bonus;

    public SeniorManager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    // Copy constructor
    public SeniorManager(SeniorManager other) {
        super(other.name, other.id, other.baseSalary);
        this.bonus = other.bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public void displayInfo() {
        showName();
        showId();
        System.out.println("Department: " + getDepartment());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
