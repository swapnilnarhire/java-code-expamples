/*
Problem Statement:
• Write a program that takes a student's score as input and assigns a grade based on the following criteria:
  - 90 and above: A
  - 80-89: B
  - 70-79: C
  - 60-69: D
  - Below 60: F
*/

import java.util.Scanner;

public class GradeAssigner {

    // Method to assign grade based on the score
    public static void assignGrade(int score) {
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Call the assignGrade method to assign and print the grade
        assignGrade(score);

        // Close the scanner
        scanner.close();
    }
}
