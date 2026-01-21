package javaSECertPrep.abstraction;

public class Cat extends Animal implements AnimalInterface{

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public void walk(){
        System.out.println("Cat Walks");
    }

}
