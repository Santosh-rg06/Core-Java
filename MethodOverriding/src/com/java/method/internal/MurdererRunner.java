package com.java.method.internal;

public class MurdererRunner {
    public static void main(String[] args) {
        Suspect s = new Suspect();
        s.giveStatement();

        Suspect m = new Murderer();
        m.giveStatement();

        Murderer murderer = new Murderer();
        murderer.giveStatement();
        murderer.confessCrime();
    }
}
