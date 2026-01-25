package Assement2_Gideon_Kamau.problem2;

enum DepartmentType {
    HR, IT, SALES, FINANCE
}

public class Manager extends Employee {
    private DepartmentType department;

    public Manager(String name, int id, int salary,DepartmentType department) {
        super(name,id,salary);
        setDepartment(department);
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType department) {
        if(department == null){
            throw new IllegalArgumentException("Department cannot be null or empty!");
        }
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hello "+ getName());
        System.out.println("You are in the "+ getDepartment()+" .");
        System.out.println("Your salary is $"+ getSalary());
        System.out.println("Calculated 15% of $"+getSalary()+ " is $"+calculateBonus());
    }

    @Override
    public double calculateBonus() {
        return getSalary()* 0.15;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Kamau", 1, 1500, DepartmentType.IT);
        manager.displayInfo();

    }
}
