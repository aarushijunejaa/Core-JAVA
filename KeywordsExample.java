// Java program to demonstrate basic keywords
public class KeywordsExample {

    public static void main(String[] args) {

        // 'int' keyword - to declare an integer variable
        int number = 10;

        // 'final' keyword - makes variable constant (cannot be changed)
        final int MAX = 5;

        // 'if' and 'else' keywords - conditional statements
        if (number > MAX) {
            System.out.println("Number is greater than MAX");
        } else {
            System.out.println("Number is smaller or equal to MAX");
        }

        // 'for' keyword - loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }

        // 'return' keyword - ends the method
        return;
    }
}
