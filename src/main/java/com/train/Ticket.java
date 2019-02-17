package com.train;

public class Ticket {
    int OneWay = 1000;
    int RoundTrip = 1800;
    int numberOfTicket, numberOfRTTicket;

    public Ticket(int numberOfTicket, int numberOfRTTicket) {
        this.numberOfTicket = numberOfTicket;
        this.numberOfRTTicket = numberOfRTTicket;
    }

    public void print() {
        System.out.println("Total tickets: "+ (numberOfRTTicket+numberOfTicket));
        System.out.println("Round-trip: "+ numberOfRTTicket);
        System.out.println("Total: "+ (numberOfTicket*OneWay+numberOfRTTicket*RoundTrip));
    }
}
