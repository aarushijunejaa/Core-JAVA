// Java Program to demonstrate while, do-while, for, and enhanced for loops
public class LoopDemo {

    public static void main(String[] args) {

        // 1. While Loop
        System.out.println("1. While Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }

        // 2. Do-While Loop
        System.out.println("\n2. Do-While Loop:");
        int j = 1;
        do {
            System.out.println("Number: " + j);
            j++;
        } while (j <= 5);

        // 3. For Loop
        System.out.println("\n3. For Loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.println("Value: " + k);
        }

        // 4. Enhanced For Loop (for-each)
        System.out.println("\n4. Enhanced For Loop (for-each):");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}
