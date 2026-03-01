package javaSECertPrep.Gratis.StaticKeyWord;

import java.util.function.Supplier;

//What is the result
public class Alpha {

    int ns;
    static int s;

    public Alpha(int ns) {
        if(s < ns){
            s = ns;
            this.ns = ns;
        }

    }

    void doPrint(){
        System.out.println("ns: "+ ns + " s: " + s);
    }

    static void main() {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);

        ref3.doPrint();
        ref1.doPrint();
        ref2.doPrint();

        //ns 50 s 125
        //ns 125 s 125
        //ns 0 s 125
    }
}
