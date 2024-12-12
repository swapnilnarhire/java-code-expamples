/*
 * Problem Statement:
 * Write a program to demonstrate that a final class cannot be extended.
 * Create a final class `MathUtils` with a method `add(int a, int b)`.
 * Attempt to create a subclass `AdvancedMathUtils` that extends `MathUtils` and observe the behavior.
 */

// Final class
final class MathUtils {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

// Attempt to extend the final class
// Uncommenting the following code will cause a compilation error:
// class AdvancedMathUtils extends MathUtils {
//     public int multiply(int a, int b) {
//         return a * b;
//     }
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        // Create an object of the MathUtils class
        MathUtils mathUtils = new MathUtils();

        // Use the add method
        int result = mathUtils.add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);

        // Uncomment the following line to observe the error:
        // AdvancedMathUtils advancedMathUtils = new AdvancedMathUtils();
    }
}
