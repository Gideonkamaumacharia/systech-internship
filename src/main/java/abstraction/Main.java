package abstraction;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.printName("Fluffy");

        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.printName("Bob");
    }

}
