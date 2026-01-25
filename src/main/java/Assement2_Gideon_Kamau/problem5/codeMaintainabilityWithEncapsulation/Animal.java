package Assement2_Gideon_Kamau.problem5.codeMaintainabilityWithEncapsulation;

class Animal {

    /*
     * ---   How does encapsulation improve code maintainability? --
     * Encapsulation improves code maintainability in the following ways;
     *
     * 1. Prevents invalid object state
     *
     * age is private so it cannot be changed directly from outside this class.
     * This ensures the Animal object cannot accidentally end up with an invalid age.
     */
    private int age;


    /*
     * 2. Centralizes rules in one place
     *
     * Any rule related to age lives here.
     * If requirements change in the future, we only update this method.
     * Other code that uses Animal does not need to change.
     */
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
            return;
        }

        // New rule added later without touching other code
        if (age > 50) {
            System.out.println("Age cannot be greater than 50.");
            return;
        }

        this.age = age;
    }


    /*
     * 3. Reduces coupling with other code
     *
     * Other classes do not need to know how age is stored or validated.
     * They only interact with this method.
     * This makes the code easier to change and safer to maintain.
     */
    public int getAge() {
        return age;
    }


    /*
     * 4. Makes future changes safer
     *
     * If we later decide to:
     * - log age changes
     * - load age from a database
     * - change the data type
     * we can do it inside this class without breaking existing code.
     */
    public void increaseAge() {
        setAge(this.age + 1);
    }


    /*
     * Demo usage inside the same file
     *
     * This shows how code interacts with Animal
     * without touching its internal state directly.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAge(5);     // valid
        animal.setAge(-10);   // rejected
        animal.setAge(90);    // rejected

        animal.increaseAge(); // still follows the same rules

        System.out.println("Final age: " + animal.getAge());
    }
}
