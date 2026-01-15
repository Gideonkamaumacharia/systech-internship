package abstraction;

public abstract class Animal {
    String name;
    int age;

    public abstract void makeSound();

    public void printName(String name){
        System.out.println("My name is " + name);
    }


}
