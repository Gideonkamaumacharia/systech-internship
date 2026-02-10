package javaSECertPrep.Gratis.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    static void main() {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names); //Prints [Robb, Rick, Bran]

    }
}
