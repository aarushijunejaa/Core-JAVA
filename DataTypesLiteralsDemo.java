// DataTypesLiteralsDemo.java

/*
 * Topic: Data Types & Literals in Java
 *
 * 1. Data Types:
 *    - Primitive: byte, short, int, long, float, double, char, boolean
 *    - Non-primitive: String, Arrays, Classes, etc.
 *
 * 2. Literals:
 *    - Fixed values assigned to variables (e.g., 10, 3.14, 'A', true)
 */

public class DataTypesLiteralsDemo {
    public static void main(String[] args) {
        
        // 1. Primitive Data Types
        byte b = 10;             // 8-bit integer
        short s = 100;           // 16-bit integer
        int i = 1000;            // 32-bit integer
        long l = 100000L;        // 64-bit integer (L suffix)
        
        float f = 3.14f;         // 32-bit decimal (f suffix)
        double d = 3.14159;      // 64-bit decimal
        
        char c = 'A';            // single character
        boolean bool = true;     // true/false

        // 2. Non-primitive Data Type
        String name = "Aarushi";

        // 3. Printing values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + name);

        // 4. Examples of Literals
        int decimal = 100;       // decimal literal
        int octal = 0100;        // octal literal (prefix 0)
        int hex = 0x64;          // hexadecimal literal (prefix 0x)
        int binary = 0b1100100;  // binary literal (prefix 0b)

        System.out.println("\nLiterals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);
    }
}
