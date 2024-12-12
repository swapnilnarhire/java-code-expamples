import java.util.Scanner;

/*
Problem Statement:
• Write a Java program that:
• Asks the user for two numbers and an operator (+, -, *, /).
• Uses a switch statement to perform the appropriate arithmetic operation.
• Outputs the result of the operation.
• Handle cases for addition, subtraction, multiplication, and division. For division, ensure the second number is not zero.
*/

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user for the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the appropriate arithmetic operation using a switch statement
        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }

        // Output the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
