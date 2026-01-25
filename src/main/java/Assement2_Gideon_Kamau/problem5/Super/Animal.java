package Assement2_Gideon_Kamau.problem5.Super;

class Animal {
    //super is used to access members (fields or methods) of the parent class as shown in the code below.
    String species;

    // Parent Constructor
    public Animal(String species) {
        this.species = species;
    }

    public void sleep() {
        System.out.println("The animal is sleeping...");
    }
}

class Dog extends Animal {
    String name;
    public Dog(String species,String name) {
        super("Canine");//--> Invoked the animal constructor here
        this.name=name;
    }

    @Override
    public void sleep() {
        super.sleep(); //--> Called the parent's sleep logic first using super keyword
        System.out.println("The dog is snoring loudly.");
    }
}
