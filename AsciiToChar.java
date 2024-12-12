/* 9. Write a program to print the char of 66,67,68,69 */

public class AsciiToChar {
    public static void main(String[] args) {
        // Declare the ASCII values
        int[] asciiValues = { 66, 67, 68, 69 };

        // Loop through each ASCII value and print its corresponding character
        for (int ascii : asciiValues) {
            System.out.println("Character of ASCII value " + ascii + " is: " + (char) ascii);
        }
    }
}
