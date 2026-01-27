package PracticeExercises.Wk3Day1.Shape;

public class Circle extends Shape{
    private double radius;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double areaOfCircle = Math.PI * radius * radius;
        return areaOfCircle;
    }

    @Override
    public double getPerimeter() {
        double circumferenceOfOfCircle = 2*(Math.PI *radius);
        return circumferenceOfOfCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area=" + getArea() +
                " circumference=" + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle("violet",true,7);
        System.out.println( circle.toString());
    }
}
