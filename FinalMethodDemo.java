/*
 * Problem Statement:
 * Create a class `Library` with a final method `getLibraryName()` that prints "Central Library".
 * Create a subclass `SchoolLibrary`. Attempt to override the `getLibraryName()` method and observe the behavior.
 */

class Library {
    // Final method
    public final void getLibraryName() {
        System.out.println("Central Library");
    }
}

class SchoolLibrary extends Library {
    // Attempting to override the final method will cause a compilation error
    // Uncomment the code below to observe the error:
    // @Override
    // public void getLibraryName() {
    //     System.out.println("School Library");
    // }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        // Create objects of Library and SchoolLibrary
        Library library = new Library();
        SchoolLibrary schoolLibrary = new SchoolLibrary();

        // Call the getLibraryName method
        library.getLibraryName();
        schoolLibrary.getLibraryName();
    }
}
