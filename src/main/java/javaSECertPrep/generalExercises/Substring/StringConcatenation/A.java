package javaSECertPrep.generalExercises.Substring.StringConcatenation;

public class A {
    public static void main(String[] args){
        String ta = "A";
        ta = ta.concat("B");  //Added B to A to make it AB
        String tb = "C";   //Declared & assigned variable tb
        ta = ta.concat(tb);  //Concat AB + C = ABC & since tb had an asignment,the results of the concatenation remains immutable

        ta.replace("C","D");
        ta.concat(tb);

        System.out.println(ta);//Prints ABC

        /**
         * This question tests String immutability -> String objects are immutable
         * Methods like concat() and replace() never modify the original String
         * They return new Strings
         * If you don’t assign the result → nothing changes
         *
         * **/
    }
}
