/*
 * Problem Statement:
 * Create an abstract class `Shape` with an abstract method `calculateArea()`.
 * Create subclasses `Circle` and `Rectangle` that implement `calculateArea()`.
 * Write a program to calculate the area of a circle and a rectangle using polymorphism.
 */

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Circle class that extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the calculateArea() method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of circle = π * r^2
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the calculateArea() method
    @Override
    public double calculateArea() {
        return length * width; // Area of rectangle = length * width
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // Create a Circle and a Rectangle
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new Rectangle(4, 6); // Rectangle with length 4 and width 6

        // Calculate and display the area of the Circle and Rectangle using polymorphism
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
    }
}
