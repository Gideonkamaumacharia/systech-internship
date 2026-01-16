package org.example.exercisesAndAssignments;

public class Casting {
    int myInt = 10; //Higher
    double myDouble = myInt; //Implicit Casting(Widening)
    short myShort = (short) myInt; //Lower -> Explicit casting(Narrowing)

    long myLong = (long) myDouble;

    float myFloat = (float) myDouble;

    public void cast(){
        System.out.println(myShort);
    }
   //byte --> short --> int --> float --> double --> long
    //When we do arithemtic operations with small numbers like short,byte or char,they get promoted to int
    //eg short x=2; short y=2; the result of +.-,*,/ or % is an promoted to int

    // __CONCLUSION-- :
         //In Java, all arithmetic operations on byte, short, and char are automatically promoted to int.
            //short x = 2;
            //short y = 2;
            //short z = x + y; // ❌ COMPILATION ERROR coz the result of the expression is an int


    public static void main(String[] args) {
        int a =3;
        int b =4;
        long c= 600L;
        float d=3.24f;
        double e=200.0;

//        String A = (String) a;
//        String B = (String) b;
//        Integer C = (int) c;

        //If a question as the one above appears in the exam where we have to convert numeric values to
        //Strings or the vice versa,the correct answer should be Compilation error.

    }
}
