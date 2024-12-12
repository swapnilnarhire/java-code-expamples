/*
 * Problem Statement:
 * Create a base class `Animal` with a method `makeSound()` that prints "Animal makes a sound".
 * Create subclasses `Dog`, `Cat`, and `Cow` that override the `makeSound()` method to print 
 * their respective sounds ("Dog barks", "Cat meows", "Cow moos").
 * Demonstrate runtime polymorphism by storing these objects in an array of `Animal` type and 
 * calling `makeSound()`.
 */

class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println("Cow moos");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        // Create an array of Animal type
        Animal[] animals = new Animal[3];

        // Store objects of Dog, Cat, and Cow in the array
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        // Call makeSound() on each object
        for (Animal animal : animals) {
            animal.makeSound(); // Demonstrates runtime polymorphism
        }
    }
}
