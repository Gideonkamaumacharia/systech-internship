package org.example.exercisesAndAssignments;

import java.util.Scanner; // Import required
public class UserInput {
    public static void main(String[] args) {
// Create Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read String input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read integer input
        System.out.println("Hello " + name + ", you are " + age + " years old!");
        scanner.close(); // Always close scanner when done
    }
}

