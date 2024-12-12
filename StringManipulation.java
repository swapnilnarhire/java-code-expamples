/*
Problem Statement:
• Declare a string variable and assign the value "Hello Flynaut How Are You".
• Find at which place 'Y' is present.
• Replace "how are you" with "Good morning".
• Break the string from space and print every element separately.
• Print every character of the string.
*/

public class StringManipulation {
    public static void main(String[] args) {
        // Declare a string variable and assign the value
        String str = "Hello Gaurav Vetal How Are You";

        // Find at which place 'Y' is present
        int positionOfY = str.indexOf('Y');
        System.out.println("Position of 'Y': " + positionOfY);

        // Replace "how are you" with "Good morning" (case-sensitive)
        String replacedString = str.replace("How Are You", "Good morning");
        System.out.println("Replaced String: " + replacedString);

        // Break the string from space and print every element separately
        String[] words = str.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // Print every character of the string
        System.out.println("Characters in the string:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
