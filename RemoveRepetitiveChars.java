/*
Problem Statement:
• Initialize a string with "Mahabharat".
• Write a logic to avoid repetitive characters and create a new string with unique characters.
*/

public class RemoveRepetitiveChars {
    public static void main(String[] args) {
        // Initialize a string with "Mahabharat"
        String str = "Mahabharat";

        // Create an empty string to store unique characters
        String uniqueString = "";

        // Loop through the original string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char currentChar = str.charAt(i);

            // Check if the character is not already in the uniqueString
            if (uniqueString.indexOf(currentChar) == -1) {
                // If it's not present, add it to uniqueString
                uniqueString += currentChar;
            }
        }

        // Print the string with unique characters
        System.out.println("String with unique characters: " + uniqueString);
    }
}
