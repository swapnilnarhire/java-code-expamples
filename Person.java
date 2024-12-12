/*
Problem Statement:
• Create a Person class with name, age, and phone as data members.
• The class should have the following methods:
    - setPerson: This method will receive name, age, and phone as parameters to set the values.
    - showPerson: This method will display the information of the person (name, age, phone).
*/

public class Person {

    // Data members
    String name;
    int age;
    String phone;

    // Method to set the person's details
    public void setPerson(String name, int age, String phone) {
        this.name = name; // Set name
        this.age = age; // Set age
        this.phone = phone; // Set phone number
    }

    // Method to show the person's details
    public void showPerson() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person1 = new Person();

        // Set the person's details
        person1.setPerson("John Doe", 30, "123-456-7890");

        // Display the person's details
        person1.showPerson();
    }
}
