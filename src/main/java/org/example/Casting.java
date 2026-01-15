package org.example;

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
