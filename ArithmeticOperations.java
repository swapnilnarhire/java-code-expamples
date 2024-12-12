/* 2. Using two integer variables, firstNumber and secondNumber, perform the following
arithmetic operations and print the results: */

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Declare and initialize variables
        int firstNumber = 20;
        int secondNumber = 6;

        // Perform arithmetic operations
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber; // Assumes secondNumber is not zero
        int modulus = firstNumber % secondNumber;

        // Print the results
        System.out.println(
                "Arithmetic Operations using firstNumber = " + firstNumber + " and secondNumber = " + secondNumber);
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
}
