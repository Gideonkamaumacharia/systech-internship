package PracticeExercises.Wk2Day4_OOP.exercise1;

import static PracticeExercises.Wk2Day4_OOP.exercise1.Circle.PI;

public class Shape {
    private String color;
    private boolean isFilled;

    public Shape(String color,boolean isFilled){
        this.color=color;
        this.isFilled = isFilled;
    }

    public Shape(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public double getArea(){
        return 0;
    }

    //Overloading getArea() for the rectangle
    public double getArea(double width,double height){
        double area = width * height;
        System.out.println("The area of a rectangle from the parent class is "+ area);
        return area;
    }

    //Overloading getArea() for the circle
    public double getArea(double radius){
        double area = PI * (radius*radius);
        System.out.println("The area of the circle from the  parent class is: "+ area);
        return area;
    }


    public double getPerimeter(){
        return 0;
    }

    //Overloading getPerimeter() for rectangle
    public double getPerimeter(double width,double height){
        double perimeter = 2*(width+height);
        System.out.println("The perimeter of a rectangle from the parent class is: "+ perimeter);
        return 0;
    }

    //Overloading getPerimeter for the circle
    public double getPerimeter(double radius){
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of the circle from the parent class is: " + perimeter);
        return perimeter;
    }

    @Override
    public String toString(){
        return null;
    }
}
