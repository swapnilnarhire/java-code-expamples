/*
Problem Statement:
Write a program that performs mathematical operations (e.g., addition, subtraction, division).
Handle multiple exceptions in a single catch block using the multi-catch feature:
- ArithmeticException
- NumberFormatException
Use a finally block to ensure a message (e.g., "Execution Completed") is always printed, regardless of whether an exception occurs.
*/

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // User input for operation
            System.out.print("Enter first number: ");
            String firstInput = scanner.nextLine();
            System.out.print("Enter second number: ");
            String secondInput = scanner.nextLine();
            System.out.print("Enter operation (+, -, /): ");
            char operation = scanner.nextLine().charAt(0);

            // Convert inputs to numbers
            int num1 = Integer.parseInt(firstInput);
            int num2 = Integer.parseInt(secondInput);

            // Perform mathematical operation
            int result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException | NumberFormatException e) {
            // Multi-catch block for handling both ArithmeticException and NumberFormatException
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Execution Completed.");
            scanner.close();
        }
    }
}
