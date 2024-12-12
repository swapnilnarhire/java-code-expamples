/*
 * Problem Statement:
 * Write a program to demonstrate the use of a final variable.
 * Create a class `Circle` with a final variable `PI` (value = 3.14) and a method `calculateArea()`
 * that calculates the area of a circle. Attempt to modify the `PI` value and observe the behavior.
 */

class Circle {
    // Final variable PI
    private final double PI = 3.14;

    // Method to calculate the area of the circle
    public double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Uncommenting the below code will cause a compilation error:
    // public void modifyPI() {
    //     PI = 3.14159; // Error: Cannot assign a value to final variable 'PI'
    // }
}

public class FinalVariableDemo {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle();

        // Calculate and display the area of the circle
        double radius = 5.0;
        double area = circle.calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Uncomment the following line to observe the compilation error
        // circle.modifyPI();
    }
}
