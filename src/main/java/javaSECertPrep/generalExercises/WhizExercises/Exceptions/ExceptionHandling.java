package javaSECertPrep.generalExercises.WhizExercises.Exceptions;

public class ExceptionHandling {
    public static void main(String[] args){
        int ans;
        try{

            int num = 10;
            int num1 = 0;

            ans = num/num1;
        }
        catch( ArithmeticException ae){
            ans = 0;

        }
        catch (Exception e){
            System.out.println("INvalid calculation");
        }
        //System.out.println("Answer "+ ans);  //Fails at this point ->java: variable ans might not have been initialized

    }
}
