/*
 * Problem Statement:
 * Create a class `Vehicle` with attributes `brand` and `speed`. Define a constructor to initialize these attributes.
 * Create a subclass `Car` with an additional attribute `seats`.
 * Use the `super` keyword to call the parent class constructor and initialize all attributes.
 */

class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor for Vehicle class
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int seats;

    // Constructor for Car class
    public Car(String brand, int speed, int seats) {
        // Call to the parent class constructor using super
        super(brand, speed);
        this.seats = seats;
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Seats: " + seats);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", 180, 5);

        // Display the details of the car
        car.displayDetails();
    }
}
