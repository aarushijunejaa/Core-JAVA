

/*
 * 📌 Topic: Arrays in Java
 *
 * 1. Need for Arrays:
 *    - Store multiple values of the same type under a single name.
 *    - Avoid declaring multiple variables individually.
 *    - Allows iteration and easy manipulation of a collection of data.
 *
 * 2. Array Creation:
 *    - Syntax:
 *        dataType[] arrayName = new dataType[size];  // dynamic size
 *        OR
 *        dataType[] arrayName = {val1, val2, val3}; // static initialization
 *
 * 3. Array Traversal:
 *    - Access each element using its index (0-based).
 *    - Can use for-loop, for-each loop, or while loop.
 */

public class ArrayDemo {
    public static void main(String[] args) {

        // -------------------------
        // 1. Creating an array dynamically
        // -------------------------
        int[] numbers = new int[5];  // Array of size 5
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // -------------------------
        // 2. Creating an array statically
        // -------------------------
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        // -------------------------
        // 3. Traversing array using for loop
        // -------------------------
        System.out.println("Numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        // -------------------------
        // 4. Traversing array using for-each loop
        // -------------------------
        System.out.println("\nFruits array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // -------------------------
        // 5. Traversing array using while loop
        // -------------------------
        System.out.println("\nNumbers array using while loop:");
        int idx = 0;
        while (idx < numbers.length) {
            System.out.println(numbers[idx]);
            idx++;
        }
    }
}
