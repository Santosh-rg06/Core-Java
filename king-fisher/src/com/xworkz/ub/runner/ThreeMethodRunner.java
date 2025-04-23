package com.xworkz.ub.runner;

import com.xworkz.ub.internal.rule.*;
import com.xworkz.ub.external.impl.*;

public class ThreeMethodRunner {
    public static void main(String[] args) {

        System.out.println("\n--- SmartBoard ---");
        SmartBoard board = new SmartBoardImpl();
        board.displayLesson();
        board.switchInput();
        board.clearScreen();

        System.out.println("\n--- AttendanceSystem ---");
        AttendanceSystem attendance = new AttendanceSystemImpl();
        attendance.markAttendance();
        attendance.generateReport();
        attendance.resetAttendance();

        System.out.println("\n--- SmartBell ---");
        SmartBell bell = new SmartBellImpl();
        bell.ringBell();
        bell.setSchedule("9:00 AM");
        bell.muteBell();

        System.out.println("\n--- SmartLibrary ---");
        SmartLibrary library = new SmartLibraryImpl();
        library.scanBook();
        library.checkAvailability();
        library.issueBook();

        System.out.println("\n--- ClassroomLight ---");
        ClassroomLight light = new ClassroomLightImpl();
        light.turnOn();
        light.adjustBrightness(70);
        light.turnOff();
    }
}
