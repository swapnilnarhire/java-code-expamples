/*
 * 10. Write a program:
 * • Declare a string variable with name employeeName and print the length.
 * • Find the character at 3 index.
 * • Check whether string contains "un" or not
 */
public class StringOperations {
    public static void main(String[] args) {
        // Declare a string variable
        String employeeName = "   Gaurav Vetal   ";

        // Print the length of the string
        System.out.println("Length of the employee name: " + employeeName.length());

        // Find the character at index 3
        System.out.println("Character at index 3: " + employeeName.charAt(3));

        // Check if the string contains "un"
        if (employeeName.contains("un")) {
            System.out.println("The string contains 'un'.");
        } else {
            System.out.println("The string does not contain 'un'.");
        }

        // Remove the starting and ending spaces
        String trimmedName = employeeName.trim();
        System.out.println("Employee name after trimming spaces: '" + trimmedName + "'");
    }
}