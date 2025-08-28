

/*
 * Topic: Method Overloading in Java
 *
 * 1. Definition:
 *    Method Overloading means defining multiple methods in the same class 
 *    with the same name but with different parameter lists (number of parameters or type of parameters).
 *
 * 2. Key Points:
 *    - Return type alone cannot differentiate overloaded methods.
 *    - Overloading is resolved at compile-time (this is called **compile-time polymorphism** or **static polymorphism**).
 *    - Helps improve code readability and reusability.
 *
 * 3. Example in this code:
 *    - add(int, int)            → adds two integers
 *    - add(int, int, int)       → adds three integers
 *    - add(double, double)      → adds two decimal numbers
 */

class Calculator {
    // Overloaded method 1 → takes 2 integers
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Overloaded method 2 → takes 3 integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Overloaded method 3 → takes 2 doubles
    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded versions of add()
        int sum1 = calc.add(5, 10);             // calls add(int, int)
        int sum2 = calc.add(5, 10, 15);         // calls add(int, int, int)
        double sum3 = calc.add(5.5, 10.7);      // calls add(double, double)

        // Output results
        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 3 integers: " + sum2);
        System.out.println("Sum of 2 doubles: " + sum3);
    }
}
