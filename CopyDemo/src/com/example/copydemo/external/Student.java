package com.example.copydemo.external;

import com.example.copydemo.internal.Person;

public class Student extends Person {
    private String course;

    // Constructor chaining to superclass
    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Copy constructor
    public Student(Student other) {
        super(other.name, other.age);
        this.course = other.course;
    }

    @Override
    public void role() {
        System.out.println("Role: Student");
    }

    public void display() {
        showInfo();
        System.out.println("Course: " + course);
        role();
    }
}
