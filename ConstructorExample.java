// Java program to demonstrate different types of constructors
public class ConstructorExample {

    int id;
    String name;

    // 1. Default Constructor
    ConstructorExample() {
        id = 0;
        name = "Unknown";
        System.out.println("Default constructor called");
    }

    // 2. Parameterized Constructor
    ConstructorExample(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized constructor called");
    }

    // 3. Copy Constructor (copying data from another object)
    ConstructorExample(ConstructorExample obj) {
        id = obj.id;
        name = obj.name;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorExample s1 = new ConstructorExample();             // Default
        ConstructorExample s2 = new ConstructorExample(101, "Aarushi"); // Parameterized
        ConstructorExample s3 = new ConstructorExample(s2);            // Copy

        // Displaying values
        s1.display();
        s2.display();
        s3.display();
    }
}
