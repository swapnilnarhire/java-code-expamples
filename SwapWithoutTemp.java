/* 6. Write a program that:
• Declares two integer variables a and b with sample values.
• Swaps their values without using a third variable.
• Prints the values of a and b after swapping. */

public class SwapWithoutTemp {
    public static void main(String[] args) {
        // Declare two integer variables with sample values
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values without using a third variable
        a = a + b; // a now becomes 30 (10 + 20)
        b = a - b; // b now becomes 10 (30 - 20)
        a = a - b; // a now becomes 20 (30 - 10)

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
