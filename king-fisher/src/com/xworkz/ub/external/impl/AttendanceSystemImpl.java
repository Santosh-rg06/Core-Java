package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.AttendanceSystem;

public class AttendanceSystemImpl implements AttendanceSystem {
    public void markAttendance() {
        System.out.println("AttendanceSystem: Attendance marked.");
    }
    public void generateReport() {
        System.out.println("AttendanceSystem: Report generated.");
    }
    public void resetAttendance() {
        System.out.println("AttendanceSystem: Attendance reset.");
    }
}
