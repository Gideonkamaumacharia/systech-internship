package javaSECertPrep.generalExercises.WhizExercises;

public class Whiz2 {
    public static void main(String args[]) {

        new Whiz2().iterator(new int [ ]{10,12,13});
        // i --> {10,12,13}
        //i.length --> 3

    }

    //Iteration 1
    //x = 0
    //Condition: 0 < 3 → ✅
    //Body runs → x++ → x = 1
    //Update runs → prints i[1] → 12

    void iterator(int [ ]i) {

//        for(int x=0;x<i.length;System.out.print(i[x] + " , "))x++; //prints 12 , 13  followed by ArrayIndexOutOfBoundsException

        try{
             for(int x=0;x<i.length;System.out.print(i[x] + " , "))x++;
         }
         catch (ArrayIndexOutOfBoundsException aiobe){
             System.out.println("Array out of bound!");
         }
    }
}
