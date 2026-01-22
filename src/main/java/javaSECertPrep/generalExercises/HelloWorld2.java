package javaSECertPrep.generalExercises;

public class HelloWorld2 {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }

    public static class Car {
        public String brand;
        public String model;
        public int year;
    
        public static void main(String[] args) {
            //displayInfo();
        }
        // Constructor using this
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        // Method using this
        public  void displayInfo() {
            System.out.println(this.year + " " + this.brand + " " + this.model);
        }
        // Method comparing objects using this
        public boolean isNewerThan(Car otherCar) {
            return this.year > otherCar.year;
        }
    }
}
//How you print "Hello moon?"
    //javac invokes the compiler  .NB// javac doesnt compile class names,it compiles source files
    //therefore we need to add .java extension in the command
// __Commands__
         //javac HelloWorld2.java
         //java HelloWorld2.java moon

