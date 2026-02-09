package javaSECertPrep.generalExercises.Substring.String;

public class Main {
    static void main() {
        StringBuilder stringBuilder = new StringBuilder(5);
        String s = "";
        if(stringBuilder.equals(s)){
            System.out.println("Match1");
        } else if (stringBuilder.toString().equals(s)) {
            System.out.println("Match2");

        }else{
            System.out.println("No match.");
        }
    }
}//Prints match2 cuz the 5 in the StringBuilder is just for capacity
