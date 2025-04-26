package com.xowrkz.oops.internal;

public class Manager extends Employee {

    public Manager() {
        System.out.println("No-arg constructor of Manager");
    }

    @Override
    public void work() {
        System.out.println("Manager is managing the team");
    }

    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting");
    }
}
