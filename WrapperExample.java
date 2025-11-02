// Java program to demonstrate Wrapper classes and Autoboxing/Unboxing
public class WrapperExample {

    public static void main(String[] args) {

        // Primitive data type
        int a = 10;

        // Autoboxing: converting primitive to object
        Integer obj = a; // automatically converted (int → Integer)
        System.out.println("Autoboxing: int to Integer object = " + obj);

        // Unboxing: converting object to primitive
        int b = obj; // automatically converted (Integer → int)
        System.out.println("Unboxing: Integer object to int = " + b);

        // Using methods of wrapper class
        Integer x = 25;
        System.out.println("Integer to double value: " + x.doubleValue());
        System.out.println("Integer to binary string: " + Integer.toBinaryString(x));
    }
}
