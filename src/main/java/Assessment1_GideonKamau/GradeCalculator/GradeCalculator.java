package Assessment1_GideonKamau.GradeCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        getScores();
    }

    public static void getScores(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");

        try {
            int score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                if(score >= 90 && score <= 100){
                    System.out.print("A");
                }else if (score >= 80 && score <=89) {
                    System.out.print("B");
                }else if (score >= 70 && score <=79) {
                    System.out.print("C");
                }else if (score >= 60 && score <=69) {
                    System.out.print("D");
                } else if(score < 60){
                    System.out.print("F");}
            }else{
                System.out.println("Invalid score! Enter a value between 0 and 100.");
            }
        }
        catch(InputMismatchException ime){
            System.out.println("Input mismatch!.Enter a numeric value");
        }

        scanner.close();

    }
}
