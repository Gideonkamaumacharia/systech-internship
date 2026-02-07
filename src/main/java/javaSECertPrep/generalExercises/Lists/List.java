package javaSECertPrep.generalExercises.Lists;

import java.sql.Array;
import java.util.ArrayList;

public class List {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("D");
//        System.out.println("Array during set "+ list.set(2,"C"));//Array during set D
//        System.out.println("Get element of array after set "+list.get(2));//Get element of array after set C
//        System.out.println("Array element  reset "+list.set(2,"G")); //Array element  reset C

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        for(int i = 0;i < nums.size();i++){
            if(nums.get(i) == 2) nums.remove(i);
        }
        System.out.println(nums);//prints [1, 2, 3]
        /* This is because when the first 2 is removed,the second 2 shifts into
        * the current index i.The loop then increments i++,skipping the second 2 entirely/
        * */

        ArrayList list3 = new ArrayList<String>();
        list3.add("Carol");
        list3.add("Regina");
        list3.add("Simon");
        list3.add("Abel");
        System.out.println(list3);
    }
}
