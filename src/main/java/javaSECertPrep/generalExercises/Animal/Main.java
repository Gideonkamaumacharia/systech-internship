package javaSECertPrep.generalExercises.Animal;

public class Main {

    public static void main(String[] args) {

        //Anonymous class
        Animal cat = new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("Cat meows!");
            }
        };



        //Anonymous class that implements an existing interface
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run(){
                System.out.println("This is a runnable anonymous class!");
            }
        };
    cat.makeNoise();
    anonymousRunnable.run();
    }

}
