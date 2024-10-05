package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the prices of 5 movie tickets
        int[] ticketPrices = new int[5];
        int totalPrice = 0;

        // Prompt the user to enter the ticket prices
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga tiket film " + (i + 1) + ": ");
            ticketPrices[i] = scanner.nextInt();
            totalPrice += ticketPrices[i];  // Add to total price
        }

        // Display the individual ticket prices
        for (int i = 0; i < 5; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": " + ticketPrices[i]);
        }

        // Display the total price
        System.out.println("Total harga tiket: " + totalPrice);

        // Close the scanner
        scanner.close();
    }
}
