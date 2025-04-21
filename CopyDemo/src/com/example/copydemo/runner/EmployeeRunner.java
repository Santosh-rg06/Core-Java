package com.example.copydemo.runner;

import com.example.copydemo.external.SeniorManager;

public class EmployeeRunner {
    public static void main(String[] args) {
        SeniorManager sm1 = new SeniorManager("Alice", 1001, 55000, 12000);
        System.out.println("Original Senior Manager:");
        sm1.displayInfo();

        SeniorManager sm2 = new SeniorManager(sm1);
        System.out.println("\nCopied Senior Manager:");
        sm2.displayInfo();
    }
}
