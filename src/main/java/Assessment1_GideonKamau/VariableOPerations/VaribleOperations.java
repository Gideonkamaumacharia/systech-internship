package Assessment1_GideonKamau.VariableOPerations;

public class VaribleOperations {

    //Declared three integer variables: a = 15, b = 4, c = 7
    int a = 15;
    int b = 4;
    int c = 7;

    //Defined the main method  where I called the different methods
    public static void main(String[] args) {
        addNumbers(15,4,7);
        multiplyNumbers( 15,4);
        addAndMultiplyNumbers(15,4,7);
        getModule(15,4);

        //method overloading
        addNumbers(15,7);
        multiplyNumbers(15,4,7);

    }

    //This method adds all the numbers  and the method is been called in main
    //Used int a,int b,int c as parameters and then provided the arguments in the method call -->addNumbers(15,4,7);
    //This applies to the other methods.
    public static int addNumbers(int a,int b,int c){
        int result = a + b +c;
        System.out.println("Sum: "+ result);
        return result;
    }

    //I am overloading addNumbers() to get the sum of two numbers instead of the intial 3 numbers in the assessment
    public static int addNumbers(int a,int b){
        int result = a + b;
        System.out.println("Sum of 2 numbers upon overloading addNumbers() : "+ result);
        return result;
    }

    //This method multiplies two numbers
    public static int multiplyNumbers(int a, int b){
        int result = a * b;
        System.out.println("Product: "+ result);
        return result;

    }

    //Overloading multiplyNumbers()
    public static int multiplyNumbers(int a, int b,int c){
        int result = a * b * c;
        System.out.println("Product of numbers after overloading multiplyNumbers() : "+ result);
        return result;

    }

    //Method to display the result of (a + b) * c
    public static int addAndMultiplyNumbers(int a,int b,int c){
        int result = (a + b) * c;
        System.out.println("Expression Result: " + result);
        return result;
    }

    //Method to display the remainder
    public static int getModule(int a,int b){
        int result = a % b;
        System.out.println("Remainder: "+ result);
        return result;
    }

}
