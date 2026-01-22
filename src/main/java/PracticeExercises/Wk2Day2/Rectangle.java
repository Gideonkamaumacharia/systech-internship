package PracticeExercises.Wk2Day2;

public class Rectangle {
    public double width;
    public double height;

    //No args --> Default constructor
    public Rectangle(){

    }

    //Constructor with width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Constructor with single size (square)
    public Rectangle(double size) {
        this.width = size;
        this.height = size;
    }

}
