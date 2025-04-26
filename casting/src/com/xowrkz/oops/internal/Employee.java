package com.xowrkz.oops.internal;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
        System.out.println("No-arg constructor of Employee");
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(Employee ref) {
        this.name = ref.name;
        this.salary = ref.salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
