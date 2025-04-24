package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Balcony;

public class CityBalcony implements Balcony {

    @Override
    public void enjoyView() {
        System.out.println("Enjoying the city view from the balcony");
    }

    @Override
    public void dryClothes() {
        System.out.println("Drying clothes on the balcony");
    }

    @Override
    public void doYoga() {
        System.out.println("Doing yoga on the balcony");
    }
}
