package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.DiningRoom;

public class ModernDiningRoom implements DiningRoom {

    @Override
    public void serveFood() {
        System.out.println("Serving food in the modern dining room");
    }

    @Override
    public void cleanTable() {
        System.out.println("Cleaning the dining table");
    }

    @Override
    public void arrangeCutlery() {
        System.out.println("Arranging cutlery for dinner");
    }
}
