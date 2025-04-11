package com.java.method.internal;

public class Suspect {
    protected Suspect() {
        System.out.println("Suspect registered in the case");
    }

    public void giveStatement() {
        System.out.println("Suspect provides an alibi and statement");
    }
}
