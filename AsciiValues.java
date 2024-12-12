// 8. Write a program to print the ascii value of a,b,c,d

public class AsciiValues {
    public static void main(String[] args) {
        // Declare the characters
        char[] characters = { 'a', 'b', 'c', 'd' };

        // Loop through each character and print its ASCII value
        for (char c : characters) {
            System.out.println("ASCII value of '" + c + "' is: " + (int) c);
        }
    }
}
