package javaSECertPrep.Gratis.StaticKeyWord;

public class X {
    static int i;
    int j;

    static void main() {
        X x1 = new X();
        X x2 = new X();

        x1.i = 3; //  --> this is really X.i = 3;
        x1.j = 4;//4
        x2.i = 5;//5 -->X.i = 3; is overwritten so we have X.i = 5;
        x2.j = 6;//6

        System.out.println(
                x1.i + " " +
                x1.j + " " +
                x2.i + " " +
                x2.j
        );//prints 5 4 5 6


    }
}
