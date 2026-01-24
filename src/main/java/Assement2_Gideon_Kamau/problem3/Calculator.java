package Assement2_Gideon_Kamau.problem3;

public class Calculator {

    public static void main(String[] args) {
        //Variable declaration & assignment --> what happens if  we declare a double
         int a = 10;
         int b = 16;
         int c = 7;

        Calculator calculator = new Calculator();
        System.out.println("Sum of int a + int b: " + calculator.add(a,b));
        System.out.println("Sum of double a + double b: " + calculator.add(a,b));
        System.out.println("Sum of int a + int b + int c: "+ calculator.add(a,b,c));
        System.out.println("Sum of String a + String b: " + calculator.add(a,b));

    }
    //Constructor
    public Calculator(){

    }

    //Method Overloading
    public int add(int a,int b){
        return a + b;
    }

    public  double add(double a,double b){
        return a + b;
    }

    public  int add(int a,int b,int c){
        return a + b + c;
    }

    public  String add(String a,String b){
        return a + b;
    }


}
