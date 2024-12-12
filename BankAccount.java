/*
Problem Statement:
Create a BankAccount class with the following fields:
• accountHolder (String) – Represents the name of the account holder.
• accountNumber (String) – Represents the bank account number.
• balance (double) – Represents the current balance of the account. The balance should be initialized to 0.
• accountType (String) – Represents the type of account, such as "Checking" or "Savings".
Encapsulate the fields by making them private.
Provide getter and setter methods for each field. Ensure that the following rules apply in the setter methods:
• accountNumber should be validated to ensure it follows a specific pattern (for example, it should be numeric and have exactly 10 digits).
• balance should not be negative, and any attempt to set a negative balance should print a message.
• accountType should only accept "Checking" or "Savings". If an invalid value is set, print a message.
*/

public class BankAccount {
    // Private fields
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private String accountType;

    // Constructor to initialize a new BankAccount
    public BankAccount(String accountHolder, String accountNumber, String accountType) {
        this.accountHolder = accountHolder;
        setAccountNumber(accountNumber); // Setting using setter for validation
        this.balance = 0; // Balance initialized to 0
        setAccountType(accountType); // Setting using setter for validation
    }

    // Getter and Setter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{10}")) { // Ensures accountNumber is exactly 10 digits
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number. It should be numeric and exactly 10 digits.");
        }
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Getter and Setter for accountType
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType.equalsIgnoreCase("Checking") || accountType.equalsIgnoreCase("Savings")) {
            this.accountType = accountType;
        } else {
            System.out.println("Invalid account type. Only 'Checking' or 'Savings' are allowed.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("John Doe", "1234567890", "Checking");

        // Displaying account details
        account.displayAccountDetails();

        // Attempt to set invalid balance
        account.setBalance(-100); // This should print an error message

        // Attempt to set invalid account number
        account.setAccountNumber("12345"); // This should print an error message

        // Attempt to set an invalid account type
        account.setAccountType("Business"); // This should print an error message

        // Updating and displaying valid details
        account.setBalance(5000);
        account.setAccountNumber("9876543210");
        account.setAccountType("Savings");

        // Displaying updated account details
        account.displayAccountDetails();
    }
}
