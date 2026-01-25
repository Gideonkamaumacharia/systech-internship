package Assement2_Gideon_Kamau.problem5.override;

import Assement2_Gideon_Kamau.problem5.Overloading_Overriding.Animal;

class Dog extends Animal {
    //What is the purpose of the @Override annotation?
    // The @Override annotation tells the compiler that the child
    // class is specifically replacing a method from the parent
    @Override
    public void makeSound() {
        System.out.println("The dog barks Woof! Woof!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
