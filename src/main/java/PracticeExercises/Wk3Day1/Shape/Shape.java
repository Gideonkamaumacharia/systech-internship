package PracticeExercises.Wk3Day1.Shape;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color,boolean filled){
        if(color == null || color.trim().isEmpty()){
            throw new IllegalArgumentException("Color cannot be null or empty!");
        }
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract  double getPerimeter();

    @Override
    public String toString(){
        return "This is the parent abstract class' toString implementation!";
    }
}
