package org.gideon.Wk1.exercisesAndAssignments;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        switchCalculator();

    }

    public static void switchCalculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter an operator(+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();

        double result;

        switch (operator) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if(secondNum != 0){
                    result = firstNum / secondNum;
                }else {
                    System.out.println("Error: Division by zero!");
                    return;
                }

            }
            case '%' -> result = firstNum % secondNum;
            default -> {
                System.out.println("Error: Invalid operator!");
                return;
            }
        }
        System.out.println("Result: " + result);
    }
}
