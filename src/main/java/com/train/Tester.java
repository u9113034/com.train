package com.train;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int sumOfTicket = 0;
        int sumOfRTTicket = 0;
        int tmp = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter number of tickets: ");
            tmp = scanner.nextInt();
            if (tmp != -1) {
                sumOfTicket += tmp;
            } else {
                break;
            }
            System.out.print("How many round-trip tickets: ");
            tmp = scanner.nextInt();
            if (tmp != -1) {
                sumOfRTTicket += tmp;
            } else {
                break;
            }
        } while (true);
        Ticket tic = new Ticket(sumOfTicket, sumOfRTTicket);
        tic.print();
    }
}
