package javaSECertPrep.generalExercises.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static <T> void main() {
        List<T> list = new ArrayList<>();

        Generics<Integer> numbers = new Generics<>(23);
        numbers.print();
        System.out.println(numbers.getSomethingToPrint());
        System.out.println(numbers.setSomethingToPrint(50));

        //List<String> stringList =
    }
}
