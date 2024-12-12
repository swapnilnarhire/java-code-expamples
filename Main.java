/*
Problem Statement:
We need to create a system for vehicles where we have a base class "Vehicle" with fields such as make, model, year, and price. 
We then need to create two subclasses "Car" and "Truck" that inherit from the base class and add additional properties and methods.
The Car class should have fields like number of doors and whether it has a sunroof, while the Truck class should have fields for cargo capacity and number of wheels.
Both subclasses will override the methods to display details and calculate insurance, with additional logic specific to each subclass.
*/

class Vehicle {
    // Fields
    String make;
    String model;
    int year;
    double price;

    // Constructor to initialize the fields
    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display details of the vehicle
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Method to calculate the insurance of the vehicle
    public double calculateInsurance() {
        return 0.02 * price * (2024 - year);
    }
}

class Car extends Vehicle {
    // Fields specific to Car
    int numDoors;
    boolean hasSunroof;

    // Constructor to initialize fields of both Car and Vehicle
    public Car(String make, String model, int year, double price, int numDoors, boolean hasSunroof) {
        super(make, model, year, price); // Call to parent class constructor
        this.numDoors = numDoors;
        this.hasSunroof = hasSunroof;
    }

    // Override the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent class method
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Has Sunroof: " + (hasSunroof ? "Yes" : "No"));
    }

    // Override the calculateInsurance method for Car
    @Override
    public double calculateInsurance() {
        double insurance = super.calculateInsurance();
        if (hasSunroof) {
            insurance += 500; // Additional $500 if car has a sunroof
        }
        return insurance;
    }
}

class Truck extends Vehicle {
    // Fields specific to Truck
    double cargoCapacity;
    int numWheels;

    // Constructor to initialize fields of both Truck and Vehicle
    public Truck(String make, String model, int year, double price, double cargoCapacity, int numWheels) {
        super(make, model, year, price); // Call to parent class constructor
        this.cargoCapacity = cargoCapacity;
        this.numWheels = numWheels;
    }

    // Override the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent class method
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
        System.out.println("Number of Wheels: " + numWheels);
    }

    // Override the calculateInsurance method for Truck
    @Override
    public double calculateInsurance() {
        double insurance = super.calculateInsurance();
        if (cargoCapacity > 5000) {
            insurance += 800; // Additional $800 if truck has cargo capacity more than 5000 kg
        }
        return insurance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2020, 25000, 4, true);

        // Create a Truck object
        Truck truck = new Truck("Ford", "F-150", 2018, 40000, 6000, 6);

        // Display details and calculate insurance for Car
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Insurance: $" + car.calculateInsurance());

        System.out.println("\n");

        // Display details and calculate insurance for Truck
        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println("Insurance: $" + truck.calculateInsurance());
    }
}
