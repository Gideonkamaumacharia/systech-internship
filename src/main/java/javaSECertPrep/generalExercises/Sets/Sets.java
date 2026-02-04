package javaSECertPrep.generalExercises.Sets;

import java.util.*;

public class Sets {
    public void sets(){
        Set<String> colors = new HashSet<>();
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Yellow");// This is ignored cuz sets ignores duplicates
        colors.add("Black");
        colors.add("Orange");
        colors.add(null);
        colors.add(null);

        //System.out.println(colors); //[null, Yellow, Black, Orange, Green]

        /*
        * No duplicates
        * No positional access--> you cannot get elements by index as sets are unordered
        * At most one null . Other null values will be ignored
        *To access elements in a set , we can use; Iteration,Check for existence or Convert to an ordered list
        *
        * */

        //1.  Iteration
        System.out.println("--- Iterating with enhanced for loop ---");
        for(String color : colors){
            //System.out.println(color);
        }

        System.out.println("--- Iterating using the Iterator Interface  ---");
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            //System.out.println(color);
        }
        /*
        *What does this line imply ;Iterator<String> iterator = colors.iterator();
        * Whats the connection between Iterator and Set?
         * In Set we have this line: Iterator<E> iterator(); --> Both Set and Iterator are Interfaces
         * A generic(Set) interface has a generic interface(Iterator)
         *
         * FINDINGS
         * Iterator<E> iterator(); in Set means  * Set → stores elements  Iterator → moves through elements
         *It means Set does NOT know how you want to traverse it  But it knows how traversal should happen internally
         *
         * Iterator<E> iterator();

Let’s translate it to English:

    “For a Set holding elements of type E, I promise to return an Iterator that will iterate over elements of type E.”

So if you have:

Set<String> colors = new HashSet<>();

Then E becomes String, and Java sees:

Iterator<String> iterator();

That’s generic substitution in action.
*
* Mental model (keep this)

Think of it like this:

Set → “I hold things”

Iterator → “I walk through things”

Generics → “I guarantee what type of thing”

        * */


        //2. Check for existence using contains() method
        if(colors.contains("Blue")){
            System.out.println("Blue is in the set.");
        }
        System.out.println("Blue is not in the set.");


        //3.  Convert to an ordered list
        List<String> colorList = new ArrayList<>(colors); //the set is converted to a list

        //Now index can access elements
        String firstColor   =  colorList.getFirst();
        String firstColor2 = colorList.get(0);
        System.out.println("First Color: "+ firstColor2);

        //We can even loop through
        for(int i = 0; i < colorList.size(); i++){
            System.out.println("Index "+ i + ": "+ colorList.get(i));
        }

        //4.   Removing elements in from a set
        if(colors.contains("Yellow")){
            colors.remove("Yellow");
            System.out.println("Yellow was removed from the set.");
        }
        else{
            System.out.println("Yellow was not initially in the set.");
        }

        System.out.println(colors);

    }

    static void main() {
        Sets set = new Sets();
        set.sets();
    }

}
