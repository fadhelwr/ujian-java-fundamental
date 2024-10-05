package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Create a scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the movie name
        System.out.print("Masukkan nama film: ");
        String movieName = scanner.nextLine();

        // Convert the movie name to uppercase
        String upperCaseMovieName = movieName.toUpperCase();

        // Print the uppercase movie name
        System.out.println("Nama film dalam huruf besar: " + upperCaseMovieName);

        // Close the scanner
        scanner.close();
    }
}
