package com.train

import java.util.*

fun main(args: Array<String>) {
    var tmp: Int = 0
    var sumOfTicket: Int = 0
    var sumOfRTTickets: Int = 0

    val scanner =Scanner(System.`in`)
    do {
        print("Please enter number of tickets: ")
        tmp = scanner.nextInt()
        if (tmp != -1) {
            sumOfTicket += tmp
        } else { break }
        print("How many round-trip tickets: ")
        tmp = scanner.nextInt()
        if (tmp != -1) {
            sumOfRTTickets += tmp
        } else { break }
    } while (true)
    val tic = Ticket2(sumOfTicket, sumOfRTTickets)
    tic.print()
}

class Ticket2(var numberOfTickets: Int, var numberOfRTTickets: Int) {
    val OW: Int = 1000
    val RT: Int = 1800

    fun print() {
        println("Total tickets: " + (numberOfRTTickets + numberOfTickets))
        println("Round-trip: " + numberOfRTTickets)
        println("Total: " + (numberOfTickets * OW + numberOfRTTickets * RT))
    }
}