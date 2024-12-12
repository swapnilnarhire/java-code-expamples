/*
 * Problem Statement:
 * Create a base class `Employee` with a method `getRole()` that returns "Employee".
 * Create subclasses `Manager` and `Developer` that override `getRole()` to return "Manager" and "Developer", respectively.
 * Write a program to demonstrate dynamic method dispatch using an array of `Employee` objects.
 */

// Base class Employee
class Employee {
    // Method to return the role of the employee
    public String getRole() {
        return "Employee";
    }
}

// Subclass Manager that extends Employee
class Manager extends Employee {
    // Override getRole() to return "Manager"
    @Override
    public String getRole() {
        return "Manager";
    }
}

// Subclass Developer that extends Employee
class Developer extends Employee {
    // Override getRole() to return "Developer"
    @Override
    public String getRole() {
        return "Developer";
    }
}

public class EmployeeRoleDemo {
    public static void main(String[] args) {
        // Create an array of Employee type
        Employee[] employees = new Employee[3];
        
        // Store objects of Manager and Developer in the array
        employees[0] = new Manager(); // Manager object
        employees[1] = new Developer(); // Developer object
        employees[2] = new Employee(); // Employee object

        // Demonstrate dynamic method dispatch by calling getRole() on each object
        for (Employee emp : employees) {
            System.out.println(emp.getRole()); // Calls the appropriate overridden method
        }
    }
}
