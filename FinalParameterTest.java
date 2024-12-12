/*
 * Problem Statement:
 * Write a program to demonstrate that a method parameter declared as `final` cannot be reassigned.
 * Create a method `calculateSquare(final int number)` that attempts to modify the value of `number`.
 */

class FinalParameterDemo {
    // Method with a final parameter
    public void calculateSquare(final int number) {
        // Uncommenting the following line will cause a compilation error:
        // number = number * number; // Attempt to modify the final parameter
        System.out.println("Square of the number is: " + (number * number));
    }
}

public class FinalParameterTest {
    public static void main(String[] args) {
        // Create an object of FinalParameterDemo
        FinalParameterDemo demo = new FinalParameterDemo();

        // Call the calculateSquare method
        demo.calculateSquare(5);
    }
}
