package JavaEE.DIP;

public abstract class Car {
    private String name;
    Engine engine;
    String transmission;
    double wheelSize;

    public Car(String name,Engine engine, String transmission,double wheelSize){
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
        this.wheelSize = wheelSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
