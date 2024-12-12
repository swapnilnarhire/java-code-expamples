/* 5. Initialize an integer variable x with the value 10. Then, using assignment operators,
modify x as follows: */
public class ModifyIntegerExample {
    public static void main(String[] args) {
        // Initialize variable x
        int x = 10;
        System.out.println("Initial value of x: " + x);

        // Add 5 to x
        x += 5;
        System.out.println("After adding 5: " + x);

        // Subtract 3 from x
        x -= 3;
        System.out.println("After subtracting 3: " + x);

        // Multiply x by 2
        x *= 2;
        System.out.println("After multiplying by 2: " + x);

        // Divide x by 4
        x /= 4;
        System.out.println("After dividing by 4: " + x);

        // Set x to the remainder when divided by 3
        x %= 3;
        System.out.println("After modulus operation with 3: " + x);
    }
}
