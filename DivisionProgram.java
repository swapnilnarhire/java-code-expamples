/*
Problem Statement:
Create a Java program that performs division of two numbers.
- Take input for two numbers from the user.
- Handle the following exceptions:
  1) ArithmeticException (when dividing by zero).
  2) InputMismatchException (when the user inputs non-numeric values).
- Ensure that the program continues running after an exception by using a loop.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                int result = num1 / num2; // Division operation
                System.out.println("Result: " + result);
                break; // Exit loop if division is successful

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid numeric values.");
                scanner.next(); // Clear invalid input
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Please enter a non-zero divisor.");
            }
        }
        scanner.close(); // Close the scanner
    }
}
