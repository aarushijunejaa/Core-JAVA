

/*
 * Topic: If, If-Else, If-Else If, Ternary Operator, and Switch in Java
 *
 * 1. if statement:
 *    - Executes a block if the condition is true.
 *
 * 2. if-else statement:
 *    - Executes one block if condition is true, otherwise executes the other block.
 *
 * 3. if-else-if ladder:
 *    - Used when multiple conditions need to be checked one by one.
 *
 * 4. Ternary Operator (? :):
 *    - Short-hand for if-else.
 *    - Syntax: condition ? value_if_true : value_if_false
 *
 * 5. switch statement:
 *    - Used to select one block of code from many options.
 *    - Works with byte, short, int, char, String, enum (since Java 7, String is allowed).
 */

public class DecisionMakingDemo {
    public static void main(String[] args) {

        int number = 15;

        // -------------------------
        // 1. if statement
        // -------------------------
        if (number > 10) {
            System.out.println("if: Number is greater than 10");
        }

        // -------------------------
        // 2. if-else statement
        // -------------------------
        if (number % 2 == 0) {
            System.out.println("if-else: Number is even");
        } else {
            System.out.println("if-else: Number is odd");
        }

        // -------------------------
        // 3. if-else-if ladder
        // -------------------------
        if (number < 0) {
            System.out.println("if-else-if: Number is negative");
        } else if (number == 0) {
            System.out.println("if-else-if: Number is zero");
        } else if (number > 0 && number <= 10) {
            System.out.println("if-else-if: Number is between 1 and 10");
        } else {
            System.out.println("if-else-if: Number is greater than 10");
        }

        // -------------------------
        // 4. Ternary Operator
        // -------------------------
        String result = (number > 0) ? "Positive" : "Non-Positive";
        System.out.println("Ternary: Number is " + result);

        // -------------------------
        // 5. switch statement
        // -------------------------
        int day = 3;
        System.out.println("\nSwitch Statement:");
        switch (day) {
            case 1:
                System.out.println("Day 1 → Monday");
                break;
            case 2:
                System.out.println("Day 2 → Tuesday");
                break;
            case 3:
                System.out.println("Day 3 → Wednesday");
                break;
            case 4:
                System.out.println("Day 4 → Thursday");
                break;
            case 5:
                System.out.println("Day 5 → Friday");
                break;
            case 6:
                System.out.println("Day 6 → Saturday");
                break;
            case 7:
                System.out.println("Day 7 → Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
