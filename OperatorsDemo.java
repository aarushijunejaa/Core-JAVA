// Java Program to demonstrate different types of operators
class OperatorsDemo {

    public static void main(String[] args) {

        // --------- 1. Arithmetic Operators ---------
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // --------- 2. Relational Operators ---------
        System.out.println("Relational Operators:");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println();

        // --------- 3. Logical Operators ---------
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y = " + (x && y));  // AND
        System.out.println("x || y = " + (x || y));  // OR
        System.out.println("!x = " + (!x));          // NOT
        System.out.println();

        // --------- 4. Unary Operators ---------
        int c = 5;
        System.out.println("Unary Operators:");
        System.out.println("c = " + c);
        System.out.println("++c = " + (++c)); // pre-increment
        System.out.println("--c = " + (--c)); // pre-decrement
        System.out.println("-c = " + (-c));   // unary minus
        System.out.println();

        // --------- 5. instanceof Operator ---------
        System.out.println("instanceof Operator:");
        OperatorsDemo obj = new OperatorsDemo();
        System.out.println("obj instanceof OperatorsDemo : " + (obj instanceof OperatorsDemo));
        System.out.println();

        // --------- 6. Assignment Operators ---------
        System.out.println("Assignment Operators:");
        int num = 10;
        num += 5;  // num = num + 5
        System.out.println("After num += 5 : " + num);
        num *= 2;  // num = num * 2
        System.out.println("After num *= 2 : " + num);
        System.out.println();

        // --------- 7. Ternary Operator ---------
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
        System.out.println();

        // --------- 8. Bitwise Operators ---------
        int p = 5;   // 0101
        int q = 3;   // 0011
        System.out.println("Bitwise Operators:");
        System.out.println("p & q = " + (p & q));   // AND
        System.out.println("p | q = " + (p | q));   // OR
        System.out.println("p ^ q = " + (p ^ q));   // XOR
        System.out.println("~p = " + (~p));         // NOT
        System.out.println("p << 1 = " + (p << 1)); // Left shift
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift
    }
}
