
package com.example.external;

import com.example.internal.Project;

public class SoftwareProject extends Project {
    @Override
    public void name() {
        System.out.println("Student Management System");
    }

    @Override
    public void objective() {
        System.out.println("To manage student data, attendance, and grades.");
    }

    @Override
    public void toolsUsed() {
        System.out.println("Java, MySQL, HTML, CSS.");
    }

    @Override
    public void duration() {
        System.out.println("Completed in 4 weeks.");
    }

    @Override
    public void outcome() {
        System.out.println("Fully functional system with login, CRUD, and reporting features.");
    }
}
