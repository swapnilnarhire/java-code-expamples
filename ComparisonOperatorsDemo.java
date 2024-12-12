/* Using two integers, a and b, perform and print the results of the following
comparisons: */

public class ComparisonOperatorsDemo {
    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 15;
        int b = 10;

        // Perform comparisons
        boolean isGreater = a > b;
        boolean isLesser = a < b;
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLesserOrEqual = a <= b;

        // Print the results
        System.out.println("Comparison results for a = " + a + " and b = " + b);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLesser);
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLesserOrEqual);
    }
}
