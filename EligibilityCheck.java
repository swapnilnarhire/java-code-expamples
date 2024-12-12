/*
Problem Statement:
Write a method called checkEligibility that takes an age as a parameter and:
- Throws an IllegalArgumentException if the age is less than 0.
- Throws a custom exception SeniorCitizenException if the age is greater than 100.
Use throws in the method signature and handle these exceptions in the main method.
*/

import java.util.Scanner;

// Custom exception class for Senior Citizen
class SeniorCitizenException extends Exception {
    public SeniorCitizenException(String message) {
        super(message);
    }
}

public class EligibilityCheck {
    
    // Method to check eligibility based on age
    public static void checkEligibility(int age) throws IllegalArgumentException, SeniorCitizenException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        } else if (age > 100) {
            throw new SeniorCitizenException("Age is greater than 100, not eligible as a senior citizen.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Ask the user for their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Call the checkEligibility method
            checkEligibility(age);
        } catch (IllegalArgumentException | SeniorCitizenException e) {
            // Handle the exceptions thrown by checkEligibility method
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Execution Completed.");
        }
    }
}
