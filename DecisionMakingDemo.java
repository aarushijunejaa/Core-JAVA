// Java Program to demonstrate if-else, nested if, and if-else-if ladder
import java.util.Scanner;

public class DecisionMakingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0–100): ");
        int marks = sc.nextInt();

        // ---------- 1. Simple if-else ----------
        System.out.println("\n1. Simple if-else:");
        if (marks >= 40) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You failed the exam!");
        }

        // ---------- 2. Nested if ----------
        System.out.println("\n2. Nested if:");
        if (marks >= 90) {
            System.out.println("Excellent! You got an A+ grade.");
        } else {
            if (marks >= 75) {
                System.out.println("Very Good! You got an A grade.");
            }
        }

        // ---------- 3. Nested if-else ----------
        System.out.println("\n3. Nested if-else:");
        if (marks >= 60) {
            if (marks >= 85) {
                System.out.println("Outstanding performance!");
            } else {
                System.out.println("Good performance!");
            }
        } else {
            System.out.println("Needs improvement!");
        }

        // ---------- 4. if-else if ladder ----------
        System.out.println("\n4. if-else if ladder:");
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
