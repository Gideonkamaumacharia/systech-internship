package javaSECertPrep.generalExercises.Substring;


import java.util.ArrayList;
import java.util.List;

public class Class {
    //What will be printed here

    static void main() {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.set(1,1);

        System.out.println(myList);//[1,1,3]

    }
}
