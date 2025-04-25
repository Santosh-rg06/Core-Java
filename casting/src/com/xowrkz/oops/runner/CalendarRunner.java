package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Calendar;
import com.xowrkz.oops.internal.DigitalCalendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar cal = new Calendar();
        cal.showDate();

        Calendar cal1 = new DigitalCalendar();
        cal1.showDate();

        System.out.println("**********");

        DigitalCalendar digital = new DigitalCalendar();
        digital.showDate();
        digital.syncEvents();

        Calendar c1 = new Calendar();
        c1.setMonth("April");
        c1.setYear(2025);
        Calendar c2 = new Calendar(c1);
        System.out.println(c2);
    }
}
