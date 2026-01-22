package PracticeExercises.Wk2Day3_encapsulation;

import java.util.Scanner;

public class Student {
    //all fields are private
   private String studentId;
   private String name;
   private int age;
   private double gpa;

    public Student() {
        
    }

    //
   public static void main(String[] args) {
       //displayInfo();
       userInput();
   }


   //Getters and setters with validation
    //read-only getter method to get studentId
    public String getStudentId() {
        return studentId;
    }

    //student setter method --> studentId: 6 characters, alphanumeric
    public void setStudentId(String studentId) {
        if(studentId != null && studentId.matches("^[a-zA-Z0-9]{6}$")){
           this.studentId = studentId;
        }else{
            throw new IllegalArgumentException("Student ID must be alphanumeric and not null!");
        }
    }

    public String getName() {
        return name;
    }

    //name: not empty, at least 2 characters
    public void setName(String name) {
        if(name != null && name.length() >= 2){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Name must be at least 2 characters and not null!");
        }

    }

    public int getAge() {
        return age;
    }

    //age: between 16 and 100
    public void setAge(int age) {
        if(age < 16 || age > 100){
            //learnt that checking if age is null here will cause a compilation error
            //if nullability is needed I would've to use the wrapper class Integer
            throw new IllegalArgumentException("Age must be between 16 and 100!");
        }else{
            this.age = age;
        }
    }

    public double getGpa() {
        return gpa;
    }

    //gpa: between 0.0 and 4.0
    public void setGpa(double gpa) {
        if(gpa < 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("Gpa must be between 0.0 and 4.0");
        } else{
            this.gpa = gpa;
        }
    }

    //Constructor using setters for validation
    public Student(String studentId,String studentName,int studentAge,double studentGpa){
        this.setStudentId(studentId);
        this.setName(studentName);
        this.setAge(studentAge);
        this.setGpa(studentGpa);

    }

    public void displayInfo(){
        //System.out.println(name + " is " + age + " years old." );

        System.out.println("------- Student Record -------");
        // Use getters to access data
        System.out.println("ID:      " + getStudentId());
        System.out.println("Name:    " + getName());
        System.out.println("Age:     " + getAge());
        System.out.println("GPA:     " + getGpa());
        System.out.println("------------------------------");
    }

    public static void userInput() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your ID (6 alphanumeric): ");
            String studentId = scanner.nextLine();
//            if(studentId != null && studentId.matches("^[a-zA-Z0-9]{6}$")){
//                studentId = studentId;
//            }else{
//                throw new IllegalArgumentException("Student ID must be alphanumeric and not null!");
//            }

            System.out.print("Enter your name (min 2 chars): ");
            String name = scanner.nextLine();
//            if(name != null && name.length() >= 2){
//                name = name;
//            }else{
//                throw new IllegalArgumentException("Name must be at least 2 characters and not null!");
//            }

            System.out.print("Enter your age (16-100): ");
            int age = scanner.nextInt();
//            if(age < 16 || age > 100){
//                throw new IllegalArgumentException("Age must be between 16 and 100!");
//            }else{
//                age = age;
//            }
            scanner.nextLine();

            System.out.print("Enter your GPA (0.0-4.0): ");
            double gpa = scanner.nextDouble();
//            if(gpa < 0.0 || gpa > 4.0){
//                throw new IllegalArgumentException("Gpa must be between 0.0 and 4.0");
//            } else{
//                gpa = gpa;
//            }
            scanner.nextLine();

            //using setters to set the student details grabbed by the scanner
            Student newStudent = new Student(studentId, name, age, gpa);
            newStudent.setStudentId(studentId);
            newStudent.setName(name);
            newStudent.setAge(age);
            newStudent.setGpa(gpa);

            newStudent.displayInfo();

        } catch (IllegalArgumentException e) {

            System.out.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input type provided.");
        }
    }


}
