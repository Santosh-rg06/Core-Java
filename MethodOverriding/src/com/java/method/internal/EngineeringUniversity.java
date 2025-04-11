package com.java.method.internal;

public class EngineeringUniversity extends University {
    public EngineeringUniversity() {
        System.out.println("Engineering university is in operation");
    }

    @Override
    public void conductExams() {
        System.out.println("Engineering university conducts technical exams");
    }

    public void hostTechFest() {
        System.out.println("Engineering university hosts a tech fest");
    }
}
