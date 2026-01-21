package javaSECertPrep.exceptions;

import java.io.IOException;

public class TryCatchExceptionHandling {
    public static void main(String[] args) throws Exception {
        //To achieve calling the method in the main method for execution,the try catch is moved to the
        //method that calls the method with the exception.This is called call stack

        try {
            tryCatchExeptionHandling();
        }
        catch(NumberFormatException nfe){
            System.out.println("You cant get a number out of a string");
        }
        finally{
            System.out.println("Not executed!");
        }

    }

    public static void tryCatchExeptionHandling() throws IOException {
        int myInt = Integer.parseInt("1r");
        System.out.println("Executed");
    }
}
