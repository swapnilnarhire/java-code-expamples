/*
Problem Statement:
Write a program that:
• Asks the user to enter a grade (A, B, C, D, or F).
• Uses a switch statement to print a corresponding message:
  • A: "Excellent!"
  • B: "Good job!"
  • C: "Fair."
  • D: "Needs improvement."
  • F: "Fail."
• If the input grade is not A, B, C, D, or F, display "Invalid grade."
*/

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a grade
        System.out.print("Enter a grade (A, B, C, D, or F): ");
        char grade = scanner.next().toUpperCase().charAt(0); // Convert input to uppercase to handle case sensitivity

        // Use a switch statement to print the corresponding message
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Fair.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            case 'F':
                System.out.println("Fail.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // Close the scanner
        scanner.close();
    }
}
