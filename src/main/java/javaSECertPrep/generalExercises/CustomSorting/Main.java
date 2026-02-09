package javaSECertPrep.generalExercises.CustomSorting;


import PracticeExercises.Wk2Day3_encapsulation.Student;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {




    static void main() {
        List<Students> studs = new ArrayList<>();
        studs.add(new Students("Roy",26,"A"));
        studs.add(new Students("Gideon",28,"A"));
        studs.add(new Students("Eve",22,"B"));
        studs.add(new Students("Steve",24,"C"));

        Comparator<Students> comparable = new Comparator<Students>() {
            @Override
            public int compare(Students var1, Students var2) {
                if(var1.getAge() > var2.getAge()){
                    return 1;
                }
                else if(var1.getAge() == var2.getAge()){
                    return 0;
                }
                return -1;
            }
        };


        Collections.sort(studs);

        System.out.println(studs);
        //Comparator & Comparable
    }
}
