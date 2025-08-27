// VariablesDemo.java

/*
 * Topic: Variables in Java
 * 
 * A variable is a container that holds data during program execution.
 * Every variable has:
 *   - A data type (int, float, String, etc.)
 *   - A name (identifier)
 *   - A value (data stored)
 */

public class VariablesDemo {
    public static void main(String[] args) {
        
        // 1. Declaration and Initialization
        int age = 20;                 // integer variable
        double price = 99.99;         // decimal number
        char grade = 'A';             // single character
        boolean isJavaFun = true;     // true/false
        String name = "Aarushi";      // string (sequence of characters)

        // 2. Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);

        // 3. Updating variable values
        age = 21;  
        price = 120.50;  

        System.out.println("\nAfter update:");
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Price: " + price);

        // 4. Constants (final keyword prevents changes)
        final double PI = 3.14159;
        System.out.println("Constant PI: " + PI);
    }
}
