package javaSECertPrep.generalExercises.Substring;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {
        List< String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("A");

        myList.remove("B");
        if(myList.remove("A")){
            myList.remove("B");
        }
        System.out.println(myList);//prints CDA
    }
}
