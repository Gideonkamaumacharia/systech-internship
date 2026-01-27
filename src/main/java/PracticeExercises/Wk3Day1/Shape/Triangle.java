package PracticeExercises.Wk3Day1.Shape;

public class Triangle extends Shape{
    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(String color, boolean filled, double base, double height,double hypotenuse) {
        super(color, filled);
        if(base <= 0){
            throw new IllegalArgumentException("Base cannot be zero or negative");
        }
        this.base = base;
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative");
        }
        this.height = height;
        if(hypotenuse <= 0){
            throw new IllegalArgumentException("Hypotenuse cannot be zero or negative");
        }
        this.hypotenuse = hypotenuse;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " base =" + base +
                " height =" + height +
                " area =" + getArea() +
                " Perimeter =" + getPerimeter() +
                '}';
    }
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0.5 *(base * height);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Red",false,12,15,8);
        System.out.println(triangle.toString());
    }
}
