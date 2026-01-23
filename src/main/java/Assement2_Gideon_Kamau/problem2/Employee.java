package Assement2_Gideon_Kamau.problem2;

public class Employee {
    private String name;
    private Integer id;
    private int salary;

    public Employee( String name,int id,int salary){
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null nor empty!");
        }else{
            this.name = name;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id == null){
            throw new IllegalArgumentException("ID cannot be null!");
        }
        if(id <= 0){
            throw new IllegalArgumentException("ID must be positive!");
        }
        this.id=id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be positive!");
        }
        this.salary = salary;
    }

    //calculateBonus() method (returns 5% of salary)
    public double calculateBonus(){
        return getSalary() * 0.05;
    }

    public void displayInfo(){
        System.out.println("Hello "+ getName());
        System.out.println("Your salary is "+ getSalary());
        System.out.println("Calculated 5% of "+getSalary()+ " is "+calculateBonus());
    }

    public static void main(String[] args) {
        new Employee("Mhusika", 15,90000 ).calculateBonus();
        new Employee("Mhusika", 15,90000 ).displayInfo();

    }
}
