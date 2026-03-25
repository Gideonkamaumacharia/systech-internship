package JavaEE.DIP;

public abstract class GasolineEngine extends Car implements Engine{
    public GasolineEngine(String name, Engine engine, String transmission, double wheelSize) {
        super(name, engine, transmission, wheelSize);
    }

    @Override
    public void start() {

    }
}
