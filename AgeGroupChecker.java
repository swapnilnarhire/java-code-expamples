/*
Problem Statement:
• Write a method checkAgeGroup that takes an integer representing an age and prints whether the person is a Child, Teenager, Adult, or Senior.
• Age Group Definition:
  - Child: 0-12
  - Teenager: 13-19
  - Adult: 20-64
  - Senior: 65 and above
• Example: For input 15, the output should be Teenager.
*/

public class AgeGroupChecker {

    // Method to check the age group based on the given age
    public static void checkAgeGroup(int age) {
        if (age >= 0 && age <= 12) {
            System.out.println(age + " is a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println(age + " is a Teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println(age + " is an Adult.");
        } else if (age >= 65) {
            System.out.println(age + " is a Senior.");
        } else {
            System.out.println("Invalid age.");
        }
    }

    public static void main(String[] args) {
        // Test the checkAgeGroup method with different age values
        checkAgeGroup(15); // Expected output: 15 is a Teenager.
        checkAgeGroup(8); // Expected output: 8 is a Child.
        checkAgeGroup(30); // Expected output: 30 is an Adult.
        checkAgeGroup(70); // Expected output: 70 is a Senior.
        checkAgeGroup(-5); // Expected output: Invalid age.
    }
}
