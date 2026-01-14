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
}
