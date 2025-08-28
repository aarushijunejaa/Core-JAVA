

/*
 * Topic: Methods in Java + Object Creation Explanation
 *
 * 1. Method:
 *    - A block of code that performs a specific task.
 *    - Improves code reusability and readability.
 *    - Can be called (invoked) multiple times.
 *
 * 2. Types of Methods:
 *    - Predefined methods → Already available in Java (e.g., println()).
 *    - User-defined methods → Written by the programmer.
 *
 * 3. Method Syntax:
 *    returnType methodName(parameters) {
 *        // method body
 *    }
 *
 * 4. Method Return:
 *    - Methods can return a value (e.g., String, int) or return nothing (`void`).
 *    - Use the `return` keyword to return a value.
 *
 * 5. Object Creation in Java:
 *    Syntax → ClassName obj = new ClassName();
 *
 *    - `new` → Allocates memory in the heap for the object.
 *    - `ClassName()` → Constructor call, initializes the object.
 *    - `obj` → Reference variable (stored in stack memory) that points to the object in heap.
 *    - `=` → Assignment operator, assigns the memory address (reference) to the variable.
 *
 *    Example:
 *       Computer obj = new Computer();
 *
 *    Breakdown:
 *       - `Computer` → Class (blueprint)
 *       - `obj` → Reference variable (stack)
 *       - `new` → Allocates memory (heap)
 *       - `Computer()` → Constructor invoked
 *       - Final result: `obj` points to the memory location of the new Computer object
 */

class Computer {
    // A method with no return value (void)
    public void playMusic() {
        System.out.println("Playing music... (method with no return value)");
    }

    // A method that takes input and returns a value
    public String getAPen(int rupee) {
        if (rupee == 10) {
            return "Here is your Pen";
        } else {
            return "Not enough money for a Pen";
        }
    }
}

public class MethodsDemo {
    public static void main(String[] args) {
        // Creating object of Computer class
        // 'new' keyword allocates memory in heap, reference stored in 'obj'
        Computer obj = new Computer();

        // Calling void method
        obj.playMusic();

        // Calling method with return type
        String ans = obj.getAPen(10);
        System.out.println(ans);

        ans = obj.getAPen(5);
        System.out.println(ans);
    }
}
