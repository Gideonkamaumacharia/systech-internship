package javaSECertPrep.generalExercises.WhizExercises;

public class ArrayClass {
        public static void main(String[] args) {

            int [][]ints = new int[3][2];//This means 3 rows and two columns {[0,0,0],[0,0],[0,0]}

            ints[0] = new int[3];

            //ints[2] = {1,2,3}; //Array initializer is not allowed here and therefore code doesn't compile

            System.out.print(ints[0].length + ints[2].length);

        }

    }

