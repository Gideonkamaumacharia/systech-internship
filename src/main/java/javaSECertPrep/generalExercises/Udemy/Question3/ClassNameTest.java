package javaSECertPrep.generalExercises.Udemy.Question3;


import java.util.ArrayList;
import java.util.List;


public class ClassNameTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        StringBuilder ab = new StringBuilder("mrx");
        String string = ab.toString();
        list.add(string);

        System.out.println(string.getClass());//class java.lang.String

        System.out.println(list.getClass());//class java.util.ArrayList

    }

}
