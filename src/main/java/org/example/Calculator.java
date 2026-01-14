package org.example;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void calculate(){

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The sum is " + (num1 + num2));
        System.out.println("The difference is " + (num1 - num2));
        System.out.println("The quotient is " + (num1 / num2));
        System.out.println("The product is " + (num1 * num2));
        System.out.println("The module is " + (num1 % num2));
    }
     public void studentInformation(){
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

         System.out.print("Enter your age: ");
         int age = scanner.nextInt();

         System.out.print("Enter your grade: ");
         scanner.nextLine();
         String grade = scanner.nextLine();
         // eg A=4, B=3, C=2
         System.out.print("Enter your GPA: ");
         String GPA = scanner.nextLine();

         System.out.print("Is Graduating: ");
         boolean isGraduating = scanner.nextBoolean();

         System.out.print("Hello");
     }

}
