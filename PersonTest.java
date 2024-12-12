/*
 * Problem Statement:
 * Create a class `Person` with attributes `name` and a method `displayInfo()`.
 * Create a subclass `Employee` with an attribute `employeeId` and override `displayInfo()`.
 * Create another subclass `Manager` that adds an attribute `department` and uses the `super` 
 * keyword to access methods from both `Employee` and `Person`.
 */

class Person {
    protected String name;

    // Constructor to initialize Person attributes
    public Person(String name) {
        this.name = name;
    }

    // Method to display Person information
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    protected int employeeId;

    // Constructor to initialize Employee attributes
    public Employee(String name, int employeeId) {
        super(name); // Call to Person's constructor
        this.employeeId = employeeId;
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to Person's displayInfo()
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;

    // Constructor to initialize Manager attributes
    public Manager(String name, int employeeId, String department) {
        super(name, employeeId); // Call to Employee's constructor
        this.department = department;
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to Employee's displayInfo()
        System.out.println("Department: " + department);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Alice", 1234, "IT");

        // Display information of the manager
        manager.displayInfo();
    }
}
