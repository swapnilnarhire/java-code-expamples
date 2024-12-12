/*
Problem Statement:
• Write a program that takes the age of a person as input and checks if the person is eligible to vote.
• Assume the voting age is 18 or above.
*/

import java.util.Scanner;

public class VotingEligibilityChecker {

    // Method to check voting eligibility
    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Call the checkEligibility method to check if the person is eligible to vote
        checkEligibility(age);

        // Close the scanner
        scanner.close();
    }
}
