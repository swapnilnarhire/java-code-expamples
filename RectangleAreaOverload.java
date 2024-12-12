/*
Problem Statement:
• Write overloaded methods for the calculateArea method, one that accepts int values and another that accepts double values.
• Call both methods in the main method.
*/

public class RectangleAreaOverload {

    // Overloaded method to calculate the area of a rectangle (int values)
    public static int calculateArea(int length, int width) {
        return length * width; // Area of rectangle = length * width
    }

    // Overloaded method to calculate the area of a rectangle (double values)
    public static double calculateArea(double length, double width) {
        return length * width; // Area of rectangle = length * width
    }

    public static void main(String[] args) {
        // Test the overloaded methods with int values
        int area1 = calculateArea(5, 3); // Length = 5, Width = 3
        System.out.println("Area of Rectangle (int values): " + area1);

        // Test the overloaded methods with double values
        double area2 = calculateArea(7.5, 4.2); // Length = 7.5, Width = 4.2
        System.out.println("Area of Rectangle (double values): " + area2);
    }
}
