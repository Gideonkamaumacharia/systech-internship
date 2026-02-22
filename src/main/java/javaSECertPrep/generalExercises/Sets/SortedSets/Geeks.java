package javaSECertPrep.generalExercises.Sets.SortedSets;

import java.util.*;

class Geeks {

    public static void main(String[] args)
    {
        SortedSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("D");  //C is printed first cuz sortedSets are ordered
        ts.add("C");
        ts.add("A");  //A is ignored to align we Sets- ignoring duplicates
        ts.add("Gideon");
        //ts.add(null);  //Throws a NullPointerException cuz null are not allowed in sortedSets

        System.out.println(ts);

        String check = "E";
        System.out.println("Contains "+ check +": " + ts.contains(check)); //false
        System.out.println(ts.first());


        //Looping using enhanced loop
        System.out.println("====== Iterating using enhanced for loop ======");
        for(String t:ts){
            System.out.println(t);
        }

        System.out.println("+++++++++  Iterating using Iterator Interface ++++++++++");
        Iterator<String> iterator = ts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
