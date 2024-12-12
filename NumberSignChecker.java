/*
Problem Statement:
• Write a program that prompts the user to enter an integer and then checks if the number is positive, negative, or zero.
*/

import java.util.Scanner;

public class NumberSignChecker {

    // Method to check if the number is positive, negative, or zero
    public static void checkNumberSign(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println(number + " is Zero.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the checkNumberSign method to check if the number is positive, negative,
        // or zero
        checkNumberSign(number);

        // Close the scanner
        scanner.close();
    }
}
