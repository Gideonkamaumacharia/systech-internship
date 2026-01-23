package PracticeExercises.Wk2Day3_encapsulation;

public class Temperature {

    private double celsius;

    public Temperature(double celsius) {
        this.setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero (-273.15°C)!");
        }
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return toFahrenheit();
    }

    public double getKelvin() {
        return toKelvin();
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public void displayAllScales() {
        System.out.printf("Celsius:    %.2f°C%n", getCelsius());
        System.out.printf("Fahrenheit: %.2f°F%n", toFahrenheit());
        System.out.printf("Kelvin:     %.2f K%n", toKelvin());
    }

    public static void main(String[] args) {
        try {
            System.out.println("=== Testing Valid Temperature (25.0°C) ===");
            Temperature temp = new Temperature(25.0);
            temp.displayAllScales();

            System.out.println("\n=== Testing Absolute Zero (-273.15°C) ===");
            temp.setCelsius(-273.15);
            temp.displayAllScales();

            System.out.println("\n=== Testing Invalid Temperature (-300.0°C) ===");
            temp.setCelsius(-300.0);

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error Caught: " + e.getMessage());
        }
    }
}
