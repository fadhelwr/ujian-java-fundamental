package com.juaracoding.ujianjf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 movie names
        String[] movies = new String[5];

        // Prompt the user to enter the names of 5 movies
        System.out.println("Daftar film bioskop:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            movies[i] = scanner.nextLine();
        }

        // Display the list of movies using a loop
        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
