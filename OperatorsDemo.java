// OperatorsDemo.java

/*
 * Topic: Type Conversion, Assignment, Relational & Logical Operators in Java
 *
 * 1. Type Conversion:
 *    - Widening (implicit): smaller → larger type (safe conversion)
 *    - Narrowing (explicit): larger → smaller type (needs casting)
 *
 * 2. Assignment Operators:
 *    - =, +=, -=, *=, /=, %=
 *
 * 3. Relational Operators:
 *    - ==, !=, >, <, >=, <=
 *    - Used to compare values → result is boolean
 *
 * 4. Logical Operators:
 *    - && (AND), || (OR), ! (NOT)
 *    - Used to combine boolean expressions
 */

public class OperatorsDemo {
    public static void main(String[] args) {
        
        // -------------------------
        // 1. Type Conversion
        // -------------------------
        int intVal = 10;
        double doubleVal = intVal;  // Widening (int → double, automatic)
        System.out.println("Widening Conversion: int " + intVal + " → double " + doubleVal);

        double d = 9.78;
        int narrowedInt = (int) d;  // Narrowing (double → int, explicit cast)
        System.out.println("Narrowing Conversion: double " + d + " → int " + narrowedInt);

        // -------------------------
        // 2. Assignment Operators
        // -------------------------
        int a = 5;
        System.out.println("\nAssignment Operators:");
        a += 3;  // a = a + 3
        System.out.println("a += 3 → " + a);
        a -= 2;  // a = a - 2
        System.out.println("a -= 2 → " + a);
        a *= 4;  // a = a * 4
        System.out.println("a *= 4 → " + a);
        a /= 3;  // a = a / 3
        System.out.println("a /= 3 → " + a);
        a %= 5;  // a = a % 5
        System.out.println("a %= 5 → " + a);

        // -------------------------
        // 3. Relational Operators
        // -------------------------
        int x = 10, y = 20;
        System.out.println("\nRelational Operators:");
        System.out.println("x == y → " + (x == y));
        System.out.println("x != y → " + (x != y));
        System.out.println("x > y  → " + (x > y));
        System.out.println("x < y  → " + (x < y));
        System.out.println("x >= 10 → " + (x >= 10));
        System.out.println("y <= 20 → " + (y <= 20));

        // -------------------------
        // 4. Logical Operators
        // -------------------------
        boolean cond1 = (x < y);   // true
        boolean cond2 = (x > 5);   // true
        boolean cond3 = (x == y);  // false

        System.out.println("\nLogical Operators:");
        System.out.println("cond1 && cond2 → " + (cond1 && cond2)); // true && true → true
        System.out.println("cond1 || cond3 → " + (cond1 || cond3)); // true || false → true
        System.out.println("!cond3 → " + (!cond3));                  // !false → true
    }
}
