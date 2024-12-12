/*
Problem Statement:
• Write a program that takes a single character as input and checks if it is a vowel (a, e, i, o, u) or a consonant.
*/

import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if the character is a vowel or consonant
    public static void checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for case insensitivity
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a single character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Call the checkCharacterType method to check if it is a vowel or consonant
        checkCharacterType(ch);

        // Close the scanner
        scanner.close();
    }
}
