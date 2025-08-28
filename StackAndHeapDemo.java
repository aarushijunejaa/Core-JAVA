

/*
 * 📌 Topic: Stack vs Heap Memory in Java
 *
 * 👉 1. Stack Memory:
 *    - Stores local variables and method calls.
 *    - Each thread has its own stack.
 *    - Memory is allocated and deallocated automatically when methods are called/returned.
 *    - Works in LIFO (Last In, First Out) manner.
 *
 * 👉 2. Heap Memory:
 *    - Stores objects and instance variables.
 *    - Shared across all threads.
 *    - Requires garbage collection (GC) to clean up unused objects.
 *    - Larger than stack memory but slower to access.
 *
 * 👉 3. Example Flow in this Code:
 *    - Primitive variables (like int, double) are stored in Stack.
 *    - Object references are stored in Stack, but the actual object lives in Heap.
 *    - "new" keyword allocates memory in Heap.
 *
 * 👉 4. Reference Operator (new):
 *    - When we write: Student s1 = new Student();
 *      - 's1' is a reference stored in Stack.
 *      - 'new Student()' creates the actual object in Heap.
 *      - 's1' points to that object in Heap.
 *
 * 📝 Remember:
 *    - Stack = short-lived, method-level memory (fast, auto-managed).
 *    - Heap = object storage, shared, requires GC (slower than stack).
 */

class Student {
    int id;          // Instance variable → stored in Heap (inside the object)
    String name;     // Instance variable → stored in Heap
}

public class StackAndHeapDemo {
    public static void main(String[] args) {
        // Local primitive variable → lives in Stack
        int x = 10;

        // Object reference stored in Stack, actual Student object in Heap
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Aarushi";

        // Another object created in Heap, new reference in Stack
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Rahul";

        // Printing values
        System.out.println("Primitive (stack): x = " + x);
        System.out.println("Object 1 (heap): id = " + s1.id + ", name = " + s1.name);
        System.out.println("Object 2 (heap): id = " + s2.id + ", name = " + s2.name);

        /*
         * Memory Visualization:
         *
         * Stack (method-level):
         *   x = 10
         *   s1 → reference to Student@heap1
         *   s2 → reference to Student@heap2
         *
         * Heap (object storage):
         *   heap1: Student { id=101, name="Aarushi" }
         *   heap2: Student { id=102, name="Rahul" }
         */
    }
}
