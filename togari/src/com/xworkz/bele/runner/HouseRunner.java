package com.xworkz.bele.runner;

import com.xworkz.bele.external.impl.LightHouse;
import com.xworkz.bele.internal.rule.House;
public class HouseRunner {
    public static void main(String[] args) {
        House house = new LightHouse();
        house.clean();
    }

}
