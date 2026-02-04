package javaSECertPrep.generalExercises.Maps;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Maps {

    /**
    * THE MAP INTERFACE
    * Maps key value pairs
    * Cannot contain duplicate keys --> keys must be unique but values must not
    * Value can be duplicated
    * Uses HashCode for key storage
    * constant time 4 basic operations
    * Allow one null key and multiple null values
     * Does not follow any specific order
     * Wrapper classes are used inside the diamond operators to replace the generic E
    * */

    public static void addStudents(){
        Map<String,Integer> students = new HashMap<>();
        students.put("John",70);
        students.put("Gideon",90);
        students.put("Violet",60);
        students.put("Seron",20);
        students.put("Mercy",20);//THough mercy & Seron have the same values,that executes since map allows duplicate values
        students.put(null,null);
        students.put(null,null);//This is ignored as Java treats the first null as a key and so it ignores any other key with the same name.

        System.out.println(students); //prints {null=null, Violet=60, John=70, Gideon=90, Mercy=20, Seron=20} cuz Map doesnt follow any specific order
        students.put("Mercy",70); //Overwrites 20 and updates it to 70 since Mercy is the same key we had earlier
        System.out.println(students);

        students.replace("Seron",80);//Overwrites Seron's value --> 20 to 80
        System.out.println(students);

        //Difference between put and replace()
        /*
        * put() add key value pairs to the map if they key doesnt exist otherwise it overwrites the key's value if the ke exists
        * */
        students.put("Abednego",50); //adds student
        System.out.println(students);

        students.replace("Kramer", 40);  //Does nothing since the key doesnt exist
        System.out.println(students);

        //ContainsKey() method
        System.out.println("---   Searching for key in map   ---");
        System.out.println(students.containsKey("Gideon"));

        //ContainsValue()
        System.out.println("--- searching for values in map  ---");
        System.out.println(students.containsValue(89));

        System.out.println(students.get("Gideon")); //Prints 90 --> so the get() method is provided with the key & returns the value
        System.out.println(students.remove("Abednego"));
        System.out.println(students);
    }

    public static void main(String[] args){
        Maps.addStudents();
    }


}
