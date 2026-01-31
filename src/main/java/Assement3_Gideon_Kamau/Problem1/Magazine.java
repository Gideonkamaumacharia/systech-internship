package Assement3_Gideon_Kamau.Problem1;

import Assement3_Gideon_Kamau.Problem1.Exceptions.IllegalPublicationDateException;
import Assement3_Gideon_Kamau.Problem1.Exceptions.InvalidPropertyException;

import java.time.LocalDate;

public class Magazine extends LibraryItem{
    //properties

    private String issueNumber;
    private LocalDate publicationDate;

    public static void main(String[] args) {
        System.out.println("--- Testing Magazine Class ---");
        try {
            // 1. Valid Magazine
            Magazine mag1 = new Magazine("LIB-500", "National Geographic", "Various", true, "Vol. 202", LocalDate.of(2023, 12, 1));
            mag1.displayDetails();

            // 2. Testing Future Date (Should throw IllegalPublicationDateException)
            System.out.println("\nAttempting to create Magazine with future date...");
            Magazine mag2 = new Magazine("LIB-501", "Future Tech", "Elon", true, "Issue 1", LocalDate.now().plusDays(5));

        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        try {
            // 3. Testing Null Publication Date
            System.out.println("\nAttempting to create Magazine with null date...");
            Magazine mag3 = new Magazine("LIB-502", "Vogue", "Anna", true, "Sept 2024", null);
        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
    }


    /* PLAN/STEPS
     * Magazine Constructor that invokes the parent constructor using super keyword
     * Getters and Setters to prevent direct modification from outside the class
     * Provide validation in setters
     * use setters in the Magazine constructor to apply validation
     *
     * Override  checkout(), returnItem(), displayDetails()
     *Provide the Overrides for the above methods from the parent
     *
     * */

    //constructor

    public Magazine(String itemId, String title, String author, boolean isAvailable, String issueNumber, LocalDate publicationDate) {
        super(itemId, title, author, isAvailable);
        this.setIssueNumber(issueNumber);
        this.setPublicationDate(publicationDate);
    }

    //Getters & setters

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        if (issueNumber != null && !issueNumber.trim().isEmpty()) {
            this.issueNumber = issueNumber;
        } else {
            throw new InvalidPropertyException("Issue number cannot be empty.");
        }
    }


    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        if (publicationDate == null || publicationDate.isAfter(LocalDate.now())) {
            throw new IllegalPublicationDateException("Publication date cannot be null or in the future.");
        }
        this.publicationDate = publicationDate;
    }


    //Method overrides

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber );
        System.out.println("Publication Date: " + publicationDate);

    }

    @Override
    public void returnItem() {
        super.returnItem();
    }

    @Override
    public void checkout() {
        super.checkout();
    }
}
