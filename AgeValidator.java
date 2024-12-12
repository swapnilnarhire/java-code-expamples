/*
Problem Statement:
Create a custom exception class called InvalidAgeException that extends Exception.
Write a program where the user inputs their age. If the age is less than 18, throw the InvalidAgeException with an appropriate message.
Use try-catch blocks to handle the custom exception and display a meaningful message to the user.
*/

import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Check if the age is less than 18 and throw custom exception
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            } else {
                System.out.println("You are eligible.");
            }
        } catch (InvalidAgeException e) {
            // Handle the custom exception and display message
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
