import java.io.*;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Print the file path to check if it's correct
        System.out.println("File Path: " + filePath);

        // Declare a File object and initialize it to null
        File file = new File(filePath);

        try {
            // Check if the file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

            // Create a BufferedReader to read the file content
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Read the file line by line and print its content to the console
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            br.close();

        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException (checked exception)
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            // Handle IOException (checked exception)
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle NullPointerException (unchecked exception)
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
