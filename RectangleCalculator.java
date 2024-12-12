/* 7. Write a program that:
• Declares length and width variables of type double.
• Calculates the area and perimeter of a rectangle using the formulas:
1. Area = length * width
2. Perimeter = 2 * (length + width)
• Prints both area and perimeter values */

public class RectangleCalculator {
    public static void main(String[] args) {
        // Declare length and width variables
        double length = 10.5;
        double width = 7.2;

        // Calculate the area and perimeter of the rectangle
        double area = length * width; // Area formula
        double perimeter = 2 * (length + width); // Perimeter formula

        // Print the results
        System.out.println("Rectangle Dimensions:");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);

        System.out.println("\nResults:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
