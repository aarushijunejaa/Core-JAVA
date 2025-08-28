

/*
 * 📌 Topic: Array of Objects in Java
 *
 * 1. Object Array:
 *    - An array can store multiple objects of the same class.
 *    - Helps manage collections of objects efficiently.
 *
 * 2. Steps:
 *    a) Create class with properties (fields) and methods if needed.
 *    b) Create objects using 'new'.
 *    c) Store object references in an array.
 *    d) Access objects using array indices or loops.
 *
 * 3. Traversal:
 *    - Use for-loop, for-each loop, or while loop to iterate over objects.
 */

class Student {
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {

        // -------------------------
        // 1. Creating individual Student objects
        // -------------------------
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        // Accessing object directly
        System.out.println("Direct access:");
        System.out.println(s1.name + " : " + s1.marks);

        // -------------------------
        // 2. Creating an array of Student objects
        // -------------------------
        Student students[] = new Student[3];  // array to hold 3 Student objects
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // -------------------------
        // 3. Traversing object array using for loop
        // -------------------------
        System.out.println("\nTraversal of Student Array:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Roll No: " + students[i].rollno +
                               ", Name: " + students[i].name +
                               ", Marks: " + students[i].marks);
        }

        // -------------------------
        // 4. Optional: using a simple int array example
        // -------------------------
        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        System.out.println("\nTraversal of integer array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
