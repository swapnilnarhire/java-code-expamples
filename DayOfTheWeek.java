/*
Problem Statement:
Write a program that:
• Prompts the user to enter a number between 1 and 7.
• Uses a switch statement to print the corresponding day of the week (e.g., 1 for Monday, 2 for Tuesday, etc.).
• If the number is not between 1 and 7, display a message saying "Invalid input."
*/

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Use a switch statement to print the corresponding day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input.");
        }

        // Close the scanner
        scanner.close();
    }
}
