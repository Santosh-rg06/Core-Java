package com.example.external;

import com.example.internal.Road;

public class CityRoad extends Road {
    @Override
    public void define() {
        System.out.println("City roads are streets and avenues within urban areas.");
    }

    @Override
    public void materialUsed() {
        System.out.println("Made of asphalt or concrete.");
    }

    @Override
    public void purpose() {
        System.out.println("Facilitates city traffic, public transport, and pedestrians.");
    }

    @Override
    public void trafficType() {
        System.out.println("Heavy traffic including cars, buses, and bikes.");
    }

    @Override
    public void maintenance() {
        System.out.println("Maintained by municipal authorities regularly.");
    }
}
