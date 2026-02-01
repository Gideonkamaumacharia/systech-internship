package Assement3_Gideon_Kamau.Problem4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Company: " + EmployeeManagement.COMPANY_NAME);



        try {
            // Test 1: Successful creation and bonus calculation
            EmployeeManagement emp = new EmployeeManagement("Gideon", 50000);
            System.out.println("Employee: " + emp.getEmployeeName());
            System.out.println("Bonus: $" + emp.calculateBonus());

            // Test 2: Triggering the new Exception handling
            System.out.println("\nTesting invalid salary...");
            emp.setSalary(-1000);

        } catch (IllegalArgumentException e) {
            System.out.println("Caught Error: " + e.getMessage());
        } finally {
            System.out.println("Employee processing finished.");
        }
    }
}
