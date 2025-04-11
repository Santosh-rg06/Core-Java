package com.java.method.internal;

public class UniversityRunner {
    public static void main(String[] args) {
        University u = new University();
        u.conductExams();

        University eu = new EngineeringUniversity();
        eu.conductExams();

        EngineeringUniversity engUni = new EngineeringUniversity();
        engUni.conductExams();
        engUni.hostTechFest();
    }
}
