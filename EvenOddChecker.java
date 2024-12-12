/*
Problem Statement:
• Write a method isEvenOrOdd that takes an integer as input and prints whether the number is even or odd.
• Example: For input 7, the output should be Odd.
*/

public class EvenOddChecker {

    // Method to check if the number is even or odd
    public static void isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        // Test the isEvenOrOdd method with different numbers
        isEvenOrOdd(7); // Expected output: 7 is Odd
        isEvenOrOdd(10); // Expected output: 10 is Even
        isEvenOrOdd(0); // Expected output: 0 is Even
        isEvenOrOdd(-3); // Expected output: -3 is Odd
    }
}
