package javaSECertPrep.generalExercises.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics <T> {
    private T somethingToPrint;
    List<?> list = new ArrayList<>();

    public Generics(T somethingElseToPrint){
        this.setSomethingToPrint(somethingElseToPrint);
    }

    public T getSomethingToPrint() {
        return somethingToPrint;
    }


    public T setSomethingToPrint(T somethingToPrint) {
        if(somethingToPrint == null){
            System.out.println("Generic Parameter cannot be null!");
        }
        return this.somethingToPrint = somethingToPrint;
    }

    public void print(){
        System.out.println("The value to print is "+ this.somethingToPrint);
    }
}
