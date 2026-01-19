package Assessment1_GideonKamau.InputValidation;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int input = scanner.nextInt();

        while(input <= 0 ){
            System.out.println("Invalid! Please enter a positive number: ");
            input = scanner.nextInt();
        }
        System.out.println(input + " is a valid number.");

        //factorial
        long factorial = 1; //I used long here because we might get an input that goes beyond an integers range

        for(int num = 1;num <= input; num++){
            factorial *= num;
        }
        System.out.println("The factorial of "+ input + " is " + factorial);

    }

}
