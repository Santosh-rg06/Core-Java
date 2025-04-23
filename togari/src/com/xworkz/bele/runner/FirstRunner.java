package com.xworkz.bele.runner;

import com.xworkz.bele.internal.rule.*;
import com.xworkz.bele.external.impl.*;
public class FirstRunner {
    public static void main(String[] args) {
        Kitchen kitchen = new ModularKitchen();
        kitchen.cook();

        Bedroom bedroom = new MasterBedroom();
        bedroom.sleep();

        Bathroom bathroom = new LuxuryBathroom();
        bathroom.shower();

        LivingRoom livingroom = new FamilyLivingRoom();
        livingroom.watchTV();


        Garage garage = new CarGarage();
        garage.parkVehicle();
    }
}
