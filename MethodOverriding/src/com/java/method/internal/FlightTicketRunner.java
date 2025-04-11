package com.java.method.internal;

public class FlightTicketRunner {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        t.displayDetails();

        Ticket ft = new FlightTicket();
        ft.displayDetails();

        FlightTicket flight = new FlightTicket();
        flight.displayDetails();
        flight.checkIn();
    }
}
