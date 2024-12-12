/*
 * Problem Statement:
 * Write a program that uses the getClass() method to determine the class name of an object. 
 * Implement a scenario where a superclass `Animal` and subclasses `Dog` and `Cat` are created.
 * Dynamically check and print the class type of objects using the getClass() method.
 */

class Animal {
    // Base class with a method to print the class name dynamically
    public void printClassName() {
        System.out.println("This object is of type: " + this.getClass().getSimpleName());
    }
}

class Dog extends Animal {
    // Subclass representing a Dog
}

class Cat extends Animal {
    // Subclass representing a Cat
}

public class CheckClassType {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Dynamically check and print the class type
        genericAnimal.printClassName();
        dog.printClassName();
        cat.printClassName();
    }
}
