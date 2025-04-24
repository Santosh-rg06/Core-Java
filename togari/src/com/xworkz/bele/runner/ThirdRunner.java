package com.xworkz.bele.runner;

import com.xworkz.bele.internal.rule.*;
import com.xworkz.bele.external.impl.*;

public class ThirdRunner {
    public static void main(String[] args) {

        Library personalLibrary = new PersonalLibrary();
        personalLibrary.borrowBook();
        personalLibrary.returnBook();
        personalLibrary.readQuietly();

        Garden backyardGarden = new BackyardGarden();
        backyardGarden.waterPlants();
        backyardGarden.trimHedges();
        backyardGarden.plantFlowers();

        HomeOffice remoteHomeOffice = new RemoteHomeOffice();
        remoteHomeOffice.startMeeting();
        remoteHomeOffice.writeReport();
        remoteHomeOffice.shutDown();

        DiningRoom modernDiningRoom = new ModernDiningRoom();
        modernDiningRoom.serveFood();
        modernDiningRoom.cleanTable();
        modernDiningRoom.arrangeCutlery();

        Balcony cityBalcony = new CityBalcony();
        cityBalcony.enjoyView();
        cityBalcony.dryClothes();
        cityBalcony.doYoga();
    }
}
