package com.xworkz.ub.runner;

import com.xworkz.ub.internal.rule.*;
import com.xworkz.ub.external.impl.*;

public class SmartHospitalRunner {
    public static void main(String[] args) {

        System.out.println("\n--- VitalsMonitor ---");
        VitalsMonitor monitor = new VitalsMonitorImpl();
        monitor.checkVitals();

        System.out.println("\n--- SmartBed ---");
        SmartBed bed = new SmartBedImpl();
        bed.adjustPosition();

        System.out.println("\n--- MedicineDispenser ---");
        MedicineDispenser dispenser = new MedicineDispenserImpl();
        dispenser.dispenseMedicine();

        System.out.println("\n--- SurgeryAssistant ---");
        SurgeryAssistant assistant = new SurgeryAssistantImpl();
        assistant.assistSurgery();

        System.out.println("\n--- HealthRecordSystem ---");
        HealthRecordSystem record = new HealthRecordSystemImpl();
        record.updatePatientRecord();
    }
}
