package Assement2_Gideon_Kamau.problem2;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int id, int salary,String department) {
        super(name,id,salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department == null || department.trim().isEmpty()){
            throw new IllegalArgumentException("Department cannot be null or empty!");
        }
        this.department = department.trim();
    }

    @Override
    public void displayInfo() {
        System.out.println("Hello "+ getName());
        System.out.println("You are in the "+ getDepartment()+" .");
        System.out.println("Your salary is "+ getSalary());
        System.out.println("Calculated 15% of "+getSalary()+ " is "+calculateBonus());
    }

    @Override
    public double calculateBonus() {
        return getSalary()* 0.15;
    }

    public static void main(String[] args) {
        new Manager("Kamau", 001, 150000, "IT").calculateBonus();
        new Manager("Kamau", 001, 150000, "IT").displayInfo();

    }
}
