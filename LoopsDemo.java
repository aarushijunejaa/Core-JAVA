

/*
 * Topic: Loops in Java
 *
 * Loops are used to execute a block of code multiple times until a condition is met.
 *
 * 1. while loop:
 *    - Entry-controlled loop (condition checked first).
 *    - Syntax:
 *        while (condition) {
 *            // code
 *        }
 *
 * 2. do-while loop:
 *    - Exit-controlled loop (code executes at least once, condition checked later).
 *    - Syntax:
 *        do {
 *            // code
 *        } while (condition);
 *
 * 3. for loop:
 *    - Compact loop with initialization, condition, and update.
 *    - Syntax:
 *        for (initialization; condition; update) {
 *            // code
 *        }
 *
 * 4. Enhanced for loop (for-each):
 *    - Used to iterate over arrays/collections.
 *    - Syntax:
 *        for (datatype var : array/collection) {
 *            // code
 *        }
 */

public class LoopsDemo {
    public static void main(String[] args) {

        // -------------------------
        // 1. while loop
        // -------------------------
        int i = 1;
        System.out.println("While Loop (1 to 5):");
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // -------------------------
        // 2. do-while loop
        // -------------------------
        int j = 1;
        System.out.println("\nDo-While Loop (1 to 5):");
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);

        // -------------------------
        // 3. for loop
        // -------------------------
        System.out.println("\nFor Loop (1 to 5):");
        for (int k = 1; k <= 5; k++) {
            System.out.println("k = " + k);
        }

        // -------------------------
        // 4. Enhanced for loop
        // -------------------------
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nEnhanced For Loop (Array elements):");
        for (int num : numbers) {
            System.out.println("num = " + num);
        }
    }
}
