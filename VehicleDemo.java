/*
 * Problem Statement:
 * Create an interface `Vehicle` with a method `move()`.
 * Create classes `Car`, `Bicycle`, and `Boat` that implement the `Vehicle` interface 
 * and provide their own implementation of the `move()` method.
 * Write a program to demonstrate polymorphism using the `Vehicle` interface.
 */

// Interface Vehicle
interface Vehicle {
    // Abstract method move()
    void move();
}

// Class Car implements Vehicle interface
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car drives on the road.");
    }
}

// Class Bicycle implements Vehicle interface
class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is pedaled on the road.");
    }
}

// Class Boat implements Vehicle interface
class Boat implements Vehicle {
    @Override
    public void move() {
        System.out.println("Boat sails on water.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Create objects of Car, Bicycle, and Boat
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle boat = new Boat();

        // Demonstrate polymorphism by calling the move() method on each object
        car.move(); // Calls Car's move()
        bicycle.move(); // Calls Bicycle's move()
        boat.move(); // Calls Boat's move()
    }
}
