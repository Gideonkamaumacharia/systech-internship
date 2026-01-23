package Assement2_Gideon_Kamau.problem2;

public class Developer extends Employee{
   private String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Hello "+ getName());
        System.out.println("Your salary is "+ getSalary());
        System.out.println("Calculated 10% of "+getSalary()+ " is "+calculateBonus());
    }

    public static void main(String[] args) {
        new Developer("Gideon",14,100000,"Java").calculateBonus();
        new Developer("Gideon",14,100000,"Java").displayInfo();
//        new Developer("Gideon",14,"Java").setSalary(100000);
    }
}
