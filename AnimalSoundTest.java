/*
 * Problem Statement:
 * Create a parent class `Animal` with a method `makeSound()` that prints "Animal makes a sound."
 * Create a subclass `Dog` that overrides this method to print "Dog barks."
 * Use the `super` keyword in the subclass to call the parent class version of `makeSound()`.
 */

class Animal {
    // Parent class method
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    // Subclass method overriding the parent method
    @Override
    public void makeSound() {
        // Calling the parent class method using super
        super.makeSound();
        // Adding subclass-specific behavior
        System.out.println("Dog barks.");
    }
}

public class AnimalSoundTest {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Call the makeSound() method
        dog.makeSound();
    }
}
