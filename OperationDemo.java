/*
 * Problem Statement:
 * Create an interface `Operation` with a method `performOperation()`.
 * Create classes `Addition`, `Subtraction`, and `Multiplication` that implement the `Operation` interface.
 * Write a program to store objects of these classes in a List and invoke `performOperation()` using a loop.
 */

// Importing necessary classes for List and ArrayList
import java.util.ArrayList;
import java.util.List;

// Interface Operation
interface Operation {
    // Method to be implemented by the classes that perform the operation
    void performOperation();
}

// Class Addition implements Operation
class Addition implements Operation {
    @Override
    public void performOperation() {
        int a = 10, b = 5;
        int result = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + result);
    }
}

// Class Subtraction implements Operation
class Subtraction implements Operation {
    @Override
    public void performOperation() {
        int a = 10, b = 5;
        int result = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + result);
    }
}

// Class Multiplication implements Operation
class Multiplication implements Operation {
    @Override
    public void performOperation() {
        int a = 10, b = 5;
        int result = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }
}

public class OperationDemo {
    public static void main(String[] args) {
        // Create a list to store objects of Operation types
        List<Operation> operations = new ArrayList<>();

        // Add objects of Addition, Subtraction, and Multiplication to the list
        operations.add(new Addition());
        operations.add(new Subtraction());
        operations.add(new Multiplication());

        // Loop through the list and call performOperation() on each object
        for (Operation operation : operations) {
            operation.performOperation();
        }
    }
}
