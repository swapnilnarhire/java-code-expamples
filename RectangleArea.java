/*
Problem Statement:
• Write a method called calculateArea that takes two parameters: length (double) and width (double).
• This method should calculate and return the area of a rectangle.
• Test this method by calling it with different values of length and width.
*/

public class RectangleArea {

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width; // Area of rectangle = length * width
    }

    public static void main(String[] args) {
        // Test the calculateArea method with different values of length and width
        double area1 = calculateArea(5.0, 3.0); // Length = 5.0, Width = 3.0
        double area2 = calculateArea(7.5, 4.2); // Length = 7.5, Width = 4.2
        double area3 = calculateArea(10.0, 10.0); // Length = 10.0, Width = 10.0

        // Print the results
        System.out.println("Area of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);
        System.out.println("Area of Rectangle 3: " + area3);
    }
}
