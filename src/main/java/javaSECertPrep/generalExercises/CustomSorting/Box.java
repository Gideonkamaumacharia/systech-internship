package javaSECertPrep.generalExercises.CustomSorting;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Box {


    public void  listOfStudents(){

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o, Integer t1) {
                if(o%10 > t1%10){
                    return 1;
                }
                return -1;
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(81);
        list.add(47);
        list.add(10);

        //I want to sort by the second number so we can print 10,81,14 & 47

        Collections.sort(list,comparator);
        System.out.println(list);

   }



    static void main() {

        Box box = new Box();
        box.listOfStudents();


    }



}
