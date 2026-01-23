package PracticeExercises.Wk2Day4_OOP.exercise1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    @Override
    public double getArea() {
        double area = width * height;
        System.out.println("The area of a rectangle is "+ area);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = (height + width)*2;
        System.out.println("The perimeter of the rectangle is: "+ perimeter);
        return perimeter;
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
    public String toString(){
        return "Shape[color=" + getColor() + ", filled=" + isFilled() + "]";
    }

//    public void displayInfo(){
//        System.out.println();
//    }
    public static void main(String[] args) {
        //Using getters and setters
        double width = 3.4;
        double height = 5.5;

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        rectangle.getArea();//prints the area from the overrode method in child
        rectangle.getPerimeter();//prints the perimeter from the overrode method in child
        System.out.println(rectangle.toString());

        rectangle.getArea(width,height);//Prints the area from the overloaded method in the parent class
        rectangle.getPerimeter(width,height);//Prints the perimeter from the overloaded method in the parent class
    }

}

