package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare ticket prices
        int weekdayPrice = 35000;
        int weekendPrice = 45000;

        // Get the number of tickets from the user
        System.out.print("Masukkan jumlah tiket: ");
        int numberOfTickets = scanner.nextInt();

        // Ask user if it's a weekend (true for weekend, false for weekday)
        System.out.print("Apakah ini weekend? (true/false): ");
        boolean isWeekend = scanner.nextBoolean();

        // Determine the price based on whether it's weekend or weekday
        int ticketPrice = isWeekend ? weekendPrice : weekdayPrice;

        // Calculate total price & initiate disc
        int totalPrice = ticketPrice * numberOfTickets;
        double d = totalPrice * 0.1;
        int discount = (int) d;

        // Apply a discount if the number of tickets is more than 5
        if (numberOfTickets > 5) {
            totalPrice = totalPrice - discount;  // 10% discount
        }

        // Display the total price
        System.out.println("Total harga (dengan diskon): " + totalPrice);

        // Close the scanner
        scanner.close();
    }
}
