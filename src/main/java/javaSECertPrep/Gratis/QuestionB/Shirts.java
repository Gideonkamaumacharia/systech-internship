package javaSECertPrep.Gratis.QuestionB;

public class Shirts {
    static void main() {
        //Given
        String shirts [] [] = new String[2][2];
        shirts [0][0] = "red";
        shirts [0][1] = "blue";
        shirts [1][0] = "small";
        shirts [1][1] = "medium";

        //Which code fragment prints red: blue: small: medium:?

        for(int index = 0;index < 2;){
            for(int idx = 0; idx < 2;){
                System.out.println(shirts[index][idx] + ":");
                idx ++;
            }
            index ++;
        }
    }



}
