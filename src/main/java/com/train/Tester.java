package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int numberOfTicket;
        int numberOfRTTicket;
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        numberOfTicket = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        numberOfRTTicket = scanner.nextInt();
        Ticket tic = new Ticket(numberOfTicket, numberOfRTTicket);
        tic.print();
    }
}
