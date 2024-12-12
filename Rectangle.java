/*
Problem Statement:
• Create a Rectangle class having leftLength, topLength, rightLength, bottomLength as data members.
• The class should have the following methods:
    - setRectangle: This method will set the coordinates of the rectangle.
    - getWidth: This method will calculate and return the width of the rectangle.
    - getHeight: This method will calculate and return the height of the rectangle.
    - getArea: This method will calculate and return the area of the rectangle.
    - getPerimeter: This method will calculate and return the perimeter of the rectangle.
*/

public class Rectangle {

    // Data members representing the lengths of the sides of the rectangle
    double leftLength, topLength, rightLength, bottomLength;

    // Method to set the coordinates of the rectangle (edges)
    public void setRectangle(double leftLength, double topLength, double rightLength, double bottomLength) {
        this.leftLength = leftLength;
        this.topLength = topLength;
        this.rightLength = rightLength;
        this.bottomLength = bottomLength;
    }

    // Method to get the width of the rectangle (difference between left and right
    // lengths)
    public double getWidth() {
        return rightLength - leftLength;
    }

    // Method to get the height of the rectangle (difference between top and bottom
    // lengths)
    public double getHeight() {
        return topLength - bottomLength;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle();

        // Set the coordinates of the rectangle
        rectangle.setRectangle(0.0, 10.0, 5.0, 0.0);

        // Print the rectangle properties
        System.out.println("Width of Rectangle: " + rectangle.getWidth());
        System.out.println("Height of Rectangle: " + rectangle.getHeight());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
    }
}
