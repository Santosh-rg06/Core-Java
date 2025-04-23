package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Bedroom;

public class MasterBedroom implements Bedroom {
    @Override
    public void sleep() {
        System.out.println("Sleeping in the master bedroom");
    }
}
