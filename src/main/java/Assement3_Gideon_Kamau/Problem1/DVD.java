package Assement3_Gideon_Kamau.Problem1;

import Assement3_Gideon_Kamau.Problem1.Exceptions.DurationLessThanZeroException;
import Assement3_Gideon_Kamau.Problem1.Exceptions.InvalidPropertyException;

public class DVD extends LibraryItem{
    //properties

    private int duration;
    private String rating;

    /* PLAN/STEPS
         * DVD Constructor that invokes the parent constructor using super keyword
         * Getters and Setters to prevent direct modification from outside the class
         * Provide validation in setters
         * use setters in the DVD constructor to apply validation
     *
     * Override  checkout(), returnItem(), displayDetails()
        *Provide the Overrides for the above methods from the parent
     *
     * */

    //Constructor

    public DVD(String itemId, String title, String author, boolean isAvailable, int duration, String rating) {
        super(itemId, title, author, isAvailable);
        this.setDuration(duration);
        this.setRating(rating);
    }

    //Getters and setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration <= 0){
            throw new DurationLessThanZeroException("Duration must be greater than zero!");
        }
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        if(rating == null || rating.trim().isEmpty()){
            throw new InvalidPropertyException("Rating cannot be null or empty!");
        }
        this.rating = rating;
    }


    //Overriding methods from a parent class
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Rating: " + rating);
    }

    @Override
    public void returnItem() {
        super.returnItem();
    }

    @Override
    public void checkout() {
        super.checkout();
    }

    public static void main(String[] args) {
        System.out.println("--- Testing DVD Class ---");
        try {
            // 1. Valid DVD
            DVD dvd1 = new DVD("LIB-999", "Inception", "Christopher Nolan", true, 148, "PG-13");
            dvd1.displayDetails();
            dvd1.checkout();

            // 2. Testing Invalid Duration (Should throw exception)
            System.out.println("\nAttempting to create DVD with negative duration...");
            DVD dvd2 = new DVD("LIB-000", "Short Film", "Director", true, -5, "G");

        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        try {
            // 3. Testing Empty Rating (Should throw InvalidPropertyException)
            System.out.println("\nAttempting to create DVD with empty rating...");
            DVD dvd3 = new DVD("LIB-111", "Silent Movie", "Unknown", true, 90, "");
        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
    }

}
