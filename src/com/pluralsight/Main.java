package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Enter Your Name Here");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        // Adding all names together
        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);

        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        System.out.println("Full Name: " + fullName.toString());
    }
}