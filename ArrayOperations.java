/*
Problem Statement:
• Write a method to print all elements in the array.
• Write a method to calculate and print the sum of all elements in the array.
• Write a method to find and print the maximum and minimum elements in the array.
• Write a method to search for a specific number in the array. The method should print the index if the number is found or indicate if it is not present.
*/

public class ArrayOperations {

    // Method to print all elements in the array
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to calculate and print the sum of all elements
    public static void printSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }

    // Method to find and print the maximum and minimum elements
    public static void printMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // Method to search for a specific number in the array
    public static void searchElement(int[] arr, int number) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Element " + number + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + number + " not found in the array.");
        }
    }

    public static void main(String[] args) {
        // Initialize the array with the first 10 positive integers
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Call methods to perform array operations
        printArray(arr);
        printSum(arr);
        printMinMax(arr);
        searchElement(arr, 5);
        searchElement(arr, 15);
    }
}
