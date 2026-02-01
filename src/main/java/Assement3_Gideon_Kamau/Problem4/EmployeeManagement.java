package Assement3_Gideon_Kamau.Problem4;

public class EmployeeManagement {
    // Static field for shared data
    // Properly capitalized and locked
    public static final String COMPANY_NAME = "Tech Solutions Ltd";


    private String employeeName;
    private double salary;

    /*

        *IDENTIFIED ISSUE--> Uninitialized salary
        * The constructor doesn't set a salary, and the setSalary method is broken,
        * so calculateBonus will always result in 0.
        *This was the code;public EmployeeManagement(String name) {
        *employeeName = name;
}
     * Constructor fixed to ensure object is
     * initialized with a valid state.
     */
    public EmployeeManagement(String employeeName, double salary) {
        this.employeeName = employeeName;
        setSalary(salary); // Reuse setter for validation
    }

    /*
        *
        * The code :public void setSalary(double salary) {
                    if (salary < 0) {
                    System.out.println("Salary cannot be negative");
                    }
                    salary = salary;
                    },was assigning the parameter to itself instead of the class field.
                    * The actual this.salary remains 0.0.
                    *
       *Using System.out instead of throwing an Exception
       * allows the program to continue with invalid data

     * Fixed Encapsulation: Using 'this' keyword and
     * throwing an exception instead of just printing.
     */
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = salary;
    }

    /*
        *The calculateBonus() method is declared void but contains a return statement.
        * This will not compile.
     * Fixed Signature: Changed 'void' to 'double'
     * to allow returning the calculated value.
     */
    public double calculateBonus() {
        return this.salary * 0.1;
    }

    // Getters for demonstration
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
}
