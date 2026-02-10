package javaSECertPrep.Gratis.Constructors;
//Given the code fragment:

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee (){
        //line n1
//        this.name = new String("Joe");
//        this.contract = new Boolean(true);
//        this.salary = new Double(100);
    }
    public String toString(){
        return name + ":" + contract + ":" + salary;
    }
    public static void main(String[] args){
        Employee employee = new Employee();
        //line n2
        System.out.println(employee);
    }
}


//Which two modifications, when made independently, enable
// the code to print joe:true: 100.0? (Choose two