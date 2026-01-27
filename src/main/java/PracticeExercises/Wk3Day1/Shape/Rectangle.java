package PracticeExercises.Wk3Day1.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        if(width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative");
        }
        this.width = width;
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " width =" + width +
                " height =" + height +
                " area =" + getArea() +
                " Perimeter =" + getPerimeter() +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (width + height)* 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red",false,12,15);
        System.out.println(rectangle.toString());
    }
}
