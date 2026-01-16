package org.example.exercisesAndAssignments;

import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {
        displayAgeControl();
    }


    public static void displayAgeControl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if(age <= 2){
            System.out.println("You are an infant");
        } else if (age >= 3 && age <= 12) {
            System.out.println("You are a child");           
        }else if(age >=13 && age <= 19){
            System.out.println("You're a teenager");
        } else if (age >= 20 && age <=64) {
            System.out.println("You're an adult");
            
        }else if (age >=65){
            System.out.println("You are a senior");
        }


    }
}
