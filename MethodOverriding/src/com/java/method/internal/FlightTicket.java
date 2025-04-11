package com.java.method.internal;

public class FlightTicket extends Ticket {
    public FlightTicket() {
        System.out.println("FlightTicket booked");
    }

    @Override
    public void displayDetails() {
        System.out.println("FlightTicket: Passenger Name, Flight No, Seat No");
    }

    public void checkIn() {
        System.out.println("Online check-in completed successfully");
    }
}
