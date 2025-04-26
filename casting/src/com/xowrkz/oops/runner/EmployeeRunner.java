package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Employee;
import com.xowrkz.oops.internal.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();

        Employee managerEmp = new Manager(); // Upcasting
        managerEmp.work();

        System.out.println("**********");

        Manager manager = new Manager();
        manager.work();
        manager.conductMeeting();

        Employee original = new Employee();
        original.setName("Santosh");
        original.setSalary(75000);

        Employee copy = new Employee(original);
        System.out.println(copy);
    }
}
