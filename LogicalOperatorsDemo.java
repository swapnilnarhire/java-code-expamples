/* 4. Declare three boolean variables: isAdult, hasID, and isMember. Set them to sample
values. Use logical operators to answer the following questions and print the results:
*/

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean isAdult = true;
        boolean hasID = false;
        boolean isMember = true;

        // Logical operations
        boolean canEnterClub = isAdult && hasID;
        boolean canAccessPremium = isMember || hasID;
        boolean notMember = !isMember;

        // Print the results
        System.out.println("Boolean variables: ");
        System.out.println("isAdult: " + isAdult);
        System.out.println("hasID: " + hasID);
        System.out.println("isMember: " + isMember);

        System.out.println("\nLogical operations results: ");
        System.out.println("Can enter club (adult AND has ID): " + canEnterClub);
        System.out.println("Can access premium content (member OR has ID): " + canAccessPremium);
        System.out.println("Negation of isMember: " + notMember);
    }
}
