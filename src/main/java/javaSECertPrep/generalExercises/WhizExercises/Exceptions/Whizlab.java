package javaSECertPrep.generalExercises.WhizExercises.Exceptions;

class Whizlab {

    public static void main(String args[]) {

//        try {
//
//            System.out.println(args[0]);
//
//
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//        //AS long as we are within the same block, the eception variable is implicitly final ,therefore we cannot assign the variable
//            //different value within the catch block.
//            if (e instanceof ArrayIndexOutOfBoundsException) {
//
//               // e = new ArrayIndexOutOfBoundsException("Out of bounds");//Cannot assign a value to final variable 'e'
//
//            } else if(e instanceof NullPointerException) {
//
//                //e = new NullPointerException("Null Value");//Cannot assign a value to final variable 'e'
//
//            } else {
//
//                //e = new ArithmeticException("Arithmetic");//Cannot assign a value to final variable 'e'
//
//            }
//
//            System.out.println(e.getMessage());


        //}
        StringBuilder sb = new StringBuilder("Whiz");

        sb = sb.append("lab");

        System.out.println(sb);
        sb.append('s');
        System.out.println(sb);

        sb.setLength(7);
        System.out.println(sb);

    }

}
