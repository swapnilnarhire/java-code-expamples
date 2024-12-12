/*
Problem Statement:
• Create a Java program that defines a single-dimensional integer array of size 10.
• Initialize the array with the first 10 positive integers.
*/

public class SingleDimensionalArray {

    public static void main(String[] args) {
        // Declare a single-dimensional array of size 10
        int[] arr = new int[10];

        // Initialize the array with the first 10 positive integers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Print the array elements
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
