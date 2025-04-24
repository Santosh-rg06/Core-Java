package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.HomeOffice;

public class RemoteHomeOffice implements HomeOffice {

    @Override
    public void startMeeting() {
        System.out.println("Starting a virtual meeting from home office");
    }

    @Override
    public void writeReport() {
        System.out.println("Writing a report in the home office");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down the PC after work");
    }
}
