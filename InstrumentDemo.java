/*
 * Problem Statement:
 * Create a base class `Instrument` with a method `play()`.
 * Create subclasses `Guitar` and `Piano` that override `play()`.
 * Write a program to demonstrate upcasting and downcasting with these objects.
 */

// Base class Instrument
class Instrument {
    // Method to be overridden by subclasses
    public void play() {
        System.out.println("Playing an instrument");
    }
}

// Subclass Guitar that extends Instrument
class Guitar extends Instrument {
    // Override play() method to provide a specific implementation
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}

// Subclass Piano that extends Instrument
class Piano extends Instrument {
    // Override play() method to provide a specific implementation
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class InstrumentDemo {
    public static void main(String[] args) {
        // Upcasting: Assigning Guitar and Piano objects to Instrument references
        Instrument instrument1 = new Guitar(); // Upcasting from Guitar to Instrument
        Instrument instrument2 = new Piano();  // Upcasting from Piano to Instrument

        // Calling the play() method on the upcasted objects
        System.out.println("Upcasting:");
        instrument1.play(); // Will call Guitar's play()
        instrument2.play(); // Will call Piano's play()

        // Downcasting: Casting back to the original type (Guitar and Piano)
        System.out.println("\nDowncasting:");
        Guitar guitar = (Guitar) instrument1;  // Downcasting back to Guitar
        Piano piano = (Piano) instrument2;      // Downcasting back to Piano

        // Calling the play() method after downcasting
        guitar.play();  // Will call Guitar's play()
        piano.play();   // Will call Piano's play()
    }
}
