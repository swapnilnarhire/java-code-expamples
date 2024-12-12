/*
Problem Statement:
Create a highly encapsulated class with two integer variables. The class should provide getter and setter methods to access and modify these variables. The program should be run using the main method.
*/

public class EncapsulatedClass {

    // Private integer variables
    private int num1;
    private int num2;

    // Constructor to initialize the variables
    public EncapsulatedClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter for num1
    public int getNum1() {
        return num1;
    }

    // Setter for num1
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Getter for num2
    public int getNum2() {
        return num2;
    }

    // Setter for num2
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Main method to test the encapsulated class
    public static void main(String[] args) {
        // Create an instance of the EncapsulatedClass
        EncapsulatedClass obj = new EncapsulatedClass(10, 20);

        // Access and modify the private variables using getter and setter methods
        System.out.println("Initial values:");
        System.out.println("num1: " + obj.getNum1());
        System.out.println("num2: " + obj.getNum2());

        // Modify the values using setters
        obj.setNum1(30);
        obj.setNum2(40);

        System.out.println("\nModified values:");
        System.out.println("num1: " + obj.getNum1());
        System.out.println("num2: " + obj.getNum2());
    }
}
