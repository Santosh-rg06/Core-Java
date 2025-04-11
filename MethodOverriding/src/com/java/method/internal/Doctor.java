package com.java.method.internal;

public class Doctor extends Profession {
    public Doctor() {
        System.out.println("preparing doctor for medical duty");
    }

    @Override
    public void work() {
        System.out.println("doctor is treating patients");
    }

    public void specialize() {
        System.out.println("doctor specializes in cardiology");
    }
}
