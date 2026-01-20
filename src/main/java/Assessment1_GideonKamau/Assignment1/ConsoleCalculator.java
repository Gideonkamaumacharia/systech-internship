package Assessment1_GideonKamau.Assignment1;

import java.util.Scanner;

public class ConsoleCalculator {

        public static void main(String[] args) {
            consoleCalculator();

        }

        public static void consoleCalculator(){
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while(running){
                System.out.println("\n=== Console Calculator ===");
                System.out.println("+ : Add");
                System.out.println("- : Subtract");
                System.out.println("* : Multiply");
                System.out.println("/ : Divide");
                System.out.println("% : Modulus");
                System.out.println("x : Exit");
                System.out.print("Enter an operator(+, -, *, /, %,x): ");
                char operator = scanner.next().charAt(0);

                if(operator == 'x'){
                    System.out.println("Exiting calculator...");
                    running = false;
                    continue;
                    //break;  --> will figure out the difference between break and continue
                }

                System.out.print("Enter the first number: ");
                int firstNum = scanner.nextInt();


                System.out.print("Enter the second number: ");
                int secondNum = scanner.nextInt();

                double result;

                switch (operator) {
                    case '+':
                        result = addNumbers(firstNum , secondNum);  //used the addNumbers method here
                        break;
                    case '-' :
                        result = differenceOfNumbers(firstNum , secondNum);
                        break;
                    case '*':
                        result = productOfNumbers(firstNum , secondNum);
                        break;
                    case '/': {
                        if(secondNum != 0){
                            result = getQuotient(firstNum , secondNum);
                        }else {
                            System.out.println("Error: Division by zero!");
                            return;
                        }

                    }
                    break;
                    case '%':
                        result = getModulus(firstNum,secondNum) ;
                        break;
                    default :
                        System.out.println("Error: Invalid operator!");
                        return;
                }
                System.out.println("Result: " + result);

            }
            scanner.close();
        }

        public static int addNumbers(int a,int b){
            return a + b;
        }

        public static int differenceOfNumbers(int a,int b){
            return a - b;
        }

        public static int productOfNumbers(int a,int b){
            return a * b;
        }

        public static int getQuotient(int a,int b){
            return a / b;
        }

        public static double getModulus(int a,int b){
            return a % b;
        }
    }

