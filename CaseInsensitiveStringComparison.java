/*
Problem Statement:
• Initialize two strings and check whether the 1st string is the same as the 2nd string or not.
• The comparison should be case-insensitive.
• The program should not use `equals()`, `equalsIgnoreCase()`, or `compareToIgnoreCase()` methods.
*/

public class CaseInsensitiveStringComparison {
    public static void main(String[] args) {
        // Initialize two strings
        String str1 = "HelloWorld";
        String str2 = "helloworld";

        // Convert both strings to lowercase (or uppercase) for case-insensitive
        // comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if both strings are the same
        if (str1.length() == str2.length()) {
            boolean isSame = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isSame = false;
                    break;
                }
            }

            // Output the result
            if (isSame) {
                System.out.println("Both strings are the same (case-insensitive).");
            } else {
                System.out.println("Both strings are not the same.");
            }
        } else {
            System.out.println("Both strings are not the same.");
        }
    }
}
