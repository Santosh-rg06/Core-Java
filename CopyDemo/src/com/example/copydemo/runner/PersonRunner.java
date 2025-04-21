package com.example.copydemo.runner;

import com.example.copydemo.external.Student;

public class PersonRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 21, "Computer Science");
        System.out.println("Original Student:");
        student1.display();

        Student student2 = new Student(student1);
        System.out.println("\nCopied Student:");
        student2.display();
    }
}
