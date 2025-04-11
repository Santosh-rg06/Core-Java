package com.java.method.internal;

public class Murderer extends Suspect {
    public Murderer() {
        System.out.println("Murderer identified after investigation");
    }

    @Override
    public void giveStatement() {
        System.out.println("Murderer denies the charges during interrogation");
    }

    public void confessCrime() {
        System.out.println("Murderer confesses to the crime with motive");
    }
}
