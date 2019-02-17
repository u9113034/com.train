package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner =Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var numberOfTickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var numberOfRTTickets = scanner.nextInt()
    val tic = Ticket2(numberOfTickets, numberOfRTTickets)
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