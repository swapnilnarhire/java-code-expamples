/*
Problem Statement:
• Write a program that asks for a student's marks and age.
• If the student is 18 years or older and has scored 75% or above, they are eligible for admission.
• Declare 3 subjects as variables and initialize them with marks out of 100.
• Calculate the percentage and check eligibility.
*/

import java.util.Scanner;

public class AdmissionEligibilityChecker {

    // Method to check admission eligibility based on marks and age
    public static void checkAdmissionEligibility(int age, double percentage) {
        if (age >= 18 && percentage >= 75) {
            System.out.println("You are eligible for admission.");
        } else {
            System.out.println("You are not eligible for admission.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare marks for 3 subjects and initialize with values
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate the total marks and percentage
        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (double) totalMarks / 3;

        // Ask for the student's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Call the checkAdmissionEligibility method to check eligibility
        checkAdmissionEligibility(age, percentage);

        // Close the scanner
        scanner.close();
    }
}
