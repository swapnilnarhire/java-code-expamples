/*
Problem Statement:
• Write a Java program that checks if a given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward (ignoring spaces and punctuation).
• Example: "madam" is a palindrome, but "hello" is not.
*/

public class PalindromeCheck {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and punctuation, convert to lowercase for case insensitivity
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize pointers to start and end of the string
        int start = 0;
        int end = str.length() - 1;

        // Check characters from start and end
        while (start < end) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        // If the loop completes without returning false, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Test the isPalindrome method with different strings
        System.out.println("Is 'madam' a palindrome? " + isPalindrome("madam")); // Expected output: true
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello")); // Expected output: false
        System.out.println(
                "Is 'A man, a plan, a canal, Panama' a palindrome? " + isPalindrome("A man, a plan, a canal, Panama")); // Expected
                                                                                                                        // output:
                                                                                                                        // true
    }
}
