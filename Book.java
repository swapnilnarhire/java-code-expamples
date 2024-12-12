/*
Problem Statement:
Create a class called Book with attributes `title` (String), `author` (String), and `price` (double). Override the `toString()` method to provide a meaningful string representation of the object. Create a few objects of Book and print them to the console.
*/

public class Book {

    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Override the toString() method to provide a meaningful string representation
    // of the object
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Price: $" + price + "]";
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating few objects of Book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);
        Book book3 = new Book("1984", "George Orwell", 8.99);

        // Printing the book objects (the toString() method will be called
        // automatically)
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
