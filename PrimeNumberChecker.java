/*
Problem Statement:
• Write a Java method that takes an integer as input and returns true if the number is prime, and false otherwise.
• Prime numbers are greater than 1 and have no divisors other than 1 and themselves.
• Example: 5 is prime, 4 is not prime.
*/

public class PrimeNumberChecker {

    // Method to check if the number is prime
    public static boolean isPrime(int number) {
        // Check if number is less than or equal to 1
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Loop to check if the number is divisible by any number from 2 to the square
        // root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // If not divisible by any number, it's prime
    }

    public static void main(String[] args) {
        // Test the isPrime method with different numbers
        System.out.println("Is 5 prime? " + isPrime(5)); // Expected output: true
        System.out.println("Is 4 prime? " + isPrime(4)); // Expected output: false
        System.out.println("Is 17 prime? " + isPrime(17)); // Expected output: true
        System.out.println("Is 18 prime? " + isPrime(18)); // Expected output: false
    }
}
