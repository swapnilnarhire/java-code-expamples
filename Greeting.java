/*
Problem Statement:
• Write a Java method named greetUser that takes a String parameter (the user's name) and prints a greeting message with the username.
• Call this method in the main method and test it with different names.
*/

public class Greeting {

    // Method to greet the user
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to the program.");
    }

    public static void main(String[] args) {
        // Test the greetUser method with different names
        greetUser("John");
        greetUser("Alice");
        greetUser("Bob");
    }
}
