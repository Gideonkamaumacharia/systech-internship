package Assement2_Gideon_Kamau.problem5.WhyPrivateMatters;

public class Animal {

    public int publicAge;       // When age is public,we have no control at all
    protected int protectedAge; // Age is accessible by subclasses
    private int privateAge;     // Private allows full encapsulation ->not accessible outside the class without a getter and a setter

    //Here we create the getter and the setter method for the privateAge->making it accessible outside the class
    public void setPrivateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.privateAge = age;
    }

    public int getPrivateAge() {
        return privateAge;
    }
}

class Dog extends Animal {

    public void demoAccess() {

        publicAge = -10;        //  Allowed (dangerous)
        protectedAge = -20;     // Allowed in subclass
        // privateAge = -30;    //  Not allowed —> compile-time error

        setPrivateAge(-40);     //  Validation blocks an invalid state by throwing an exception.
    }
}

