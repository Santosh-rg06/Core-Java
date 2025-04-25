package com.xowrkz.oops.internal;

public class Calendar {
    private String month;
    private int year;
    public Calendar() {
        System.out.println("no-arg constructor of Calendar");
    }

    public void showDate() {
        System.out.println("Running showDate() in Calendar");
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Calendar(Calendar ref) {
        this.month = ref.month;
        this.year = ref.year;
    }

    @Override
    public String toString() {
        return "Month: " + month + ", Year: " + year;
    }

}
