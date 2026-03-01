package javaSECertPrep.generalExercises.Substring;

public class Substring {
    public static void main(String[] args) {
        String myString = "ABCDFGH";

        System.out.println(myString.substring(1,4));//BCD
        System.out.println(myString.substring(0,4));//ABCD
        System.out.println(myString.substring(4,4));
        //System.out.println(myString.substring(5,2));
        //System.out.println(myString.substring(0,11));

        String string = "MINIMUM";
        System.out.println(string.substring(4,7));

        /**
         * You should know how substring and indexOf methods of String class work.
         *
         * String substring(int beginIndex)
         *           Returns a new string that is a substring of this string.
         * String substring(int beginIndex, int endIndex)
         *           Returns a new string that is a substring of this string.
         *
         *
         * int indexOf(int ch)
         *           Returns the index within this string of the first occurrence of the specified character.
         * int indexOf(int ch, int fromIndex)
         *           Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
         * int indexOf(String str)
         *           Returns the index within this string of the first occurrence of the specified substring.
         * int indexOf(String str, int fromIndex)
         *           Returns the index within this string of the first occurrence of the specified substring, starting at the specified index
         *
         *
         * **/


    }

}
