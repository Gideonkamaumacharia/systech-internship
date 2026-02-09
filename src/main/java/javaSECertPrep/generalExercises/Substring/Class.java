package javaSECertPrep.generalExercises.Substring;


import java.util.ArrayList;
import java.util.List;

public class Class {
    //What will be printed here

    static void main() {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.set(1, 1);

        System.out.println(myList);//[1,1,3]

//        // Runnable with anonymous class
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running in thread");
//            }
//        });
//        thread.start();
//
//        Thread thread = new Thread(() -> System.out.println("Running in thread"));
//        thread.start();
//        /**
//         * Line 28- 29 is a lambda version of the anonymous class from line 20 - 26
//         * Its simple and the code is clean and readable
//         * Memory and Object overhead is reduced as separate class files are not generated on your disk
//         * Lambda also allows Faster start up and execution time
//         */
//        */
//
//        Thread thread1 = (new Runnable) -> System.out.println("Running in thread");

//        Thread thread1 = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Running in thread");
//        }
//    };
//        thread1.start();

    }
}
