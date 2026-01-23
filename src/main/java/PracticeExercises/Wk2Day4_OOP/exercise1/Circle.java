package PracticeExercises.Wk2Day4_OOP.exercise1;

public class Circle extends Shape{
    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius,String color,boolean isFilled){
        super(color,isFilled);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = PI * (radius*radius);
        System.out.println("The area of the circle is: "+ area);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of the circle is: " + perimeter);
        return perimeter;
    }

    @Override
    public String toString(){
        return "Shape[color=" + getColor() + ", filled=" + isFilled() + "]";
    }

    public static void main(String[] args) {
        //Using getters and setters
        double radius = 3.4;

        Circle circle = new Circle(radius,"blue",true);
        circle.setRadius(radius);
        circle.getArea();
        circle.getPerimeter();
        System.out.println(circle.toString());

        //printing the area and perimeter respectively from the overloaded getArea() and getPerimeter methods in Superclass
        circle.getArea(radius);
        circle.getPerimeter(radius);
    }
}
