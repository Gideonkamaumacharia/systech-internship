package javaSECertPrep.generalExercises.CustomSorting;

public class Students implements Comparable<Students> {
    private String name;
    private int age;
    private String grade;


    public Students(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Students that) {
//        if(this.getAge() > that.getAge()){
//            return 1;
//        } else if (this.getAge() == that.getAge()) {
//            return 0;
//        }
//        return -1;
//    }

    @Override
    public int compareTo(Students other) {
        // Compare by age (ascending)
        return Integer.compare(this.age, other.age);
    }



}
