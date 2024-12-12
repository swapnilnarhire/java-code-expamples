/*
Problem Statement:
• Declare two strings, `firstName` and `lastName`.
• Print the full name (first name + last name).
• Check whether the first name ends with the second name or not.
*/

public class NameChecker {
    public static void main(String[] args) {
        // Declare two strings
        String firstName = "Gaurav";
        String lastName = "Vetal";

        // Print the full name
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Check whether the first name ends with the last name
        boolean endsWith = firstName.endsWith(lastName);
        if (endsWith) {
            System.out.println("The first name ends with the last name.");
        } else {
            System.out.println("The first name does not end with the last name.");
        }
    }
}
