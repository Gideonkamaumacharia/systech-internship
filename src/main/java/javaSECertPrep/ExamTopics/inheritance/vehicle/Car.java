package javaSECertPrep.ExamTopics.inheritance.vehicle;

public class Car extends Vehicle{
    int y;
    Car(){
        super(10);
        //this(10);
    }
    Car(int y){
        super(y);
        this.y = y;
    }
    public String toString(){
        return  super.x + ":" + this.y;
    }
}
