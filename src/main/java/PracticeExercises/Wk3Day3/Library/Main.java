package PracticeExercises.Wk3Day3.Library;

import PracticeExercises.GasolineEngine;

public class Main {
    static void main() {
        Engine gas = new GasolineEngine();
        Car car =  new Car(gas);
        car.drive();

        Engine electric = new ElectricEngine();
        Car tesla = new Car(electric);
        tesla.drive();
    }
}
