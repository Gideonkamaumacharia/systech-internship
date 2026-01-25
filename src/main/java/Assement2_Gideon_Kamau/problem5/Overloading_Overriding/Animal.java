package Assement2_Gideon_Kamau.problem5.Overloading_Overriding;

public class Animal {
    //What is the difference between method overloading and method overriding?

        //The code below will demo the differences

    //Method Overloading occurs when we have multiple methods in the same class
    // with the same name but have different numbers of parameters. It allows performing operations with different inputs.
    //From line 12 -24, I am doing exactly that whereby I am using the same eat() with different number of parameters and different data types.
        // Base method
        public void eat() {
            System.out.println("The animal is eating.");
        }

        // Overloading: Same name, but takes a String parameter
        public void eat(String foodType) {
            System.out.println("The animal is eating " + foodType);
        }

        // Overloading: Same name, but takes an int parameter
        public void eat(int calories) {
            System.out.println("The animal ate " + calories + " calories.");
        }


    //Overriding -->happens when a child class changes the implementation of a method inherited from the parent.
    //The makeSound() method below is the parent(Animal) version of the method
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Dog provides it own implementation of the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }





}
