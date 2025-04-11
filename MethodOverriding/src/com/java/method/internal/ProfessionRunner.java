package com.java.method.internal;

public class ProfessionRunner {
    public static void main(String[] args) {
        Profession p = new Profession();
        p.work();

        Profession d = new Doctor();
        d.work();

        Doctor doctor = new Doctor();
        doctor.work();
        doctor.specialize();
    }
}
