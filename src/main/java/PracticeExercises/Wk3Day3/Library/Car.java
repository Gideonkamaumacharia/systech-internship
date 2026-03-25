package PracticeExercises.Wk3Day3.Library;

import PracticeExercises.GasolineEngine;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
     public void drive (){
        engine.start();
         System.out.println("Car is started!");
     }
}
