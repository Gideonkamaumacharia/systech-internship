package Assement3_Gideon_Kamau.Problem1;

import Assement3_Gideon_Kamau.Problem1.Exceptions.InvalidPropertyException;

public class Book extends LibraryItem{
    //properties
    private String isbn;
    private String genre;

    public static void main(String[] args) {
        System.out.println("--- Testing Book Subclass ---");
        try {
            // 1. Valid Book
            Book book1 = new Book("LIB-201", "Clean Code", "Robert C. Martin", true, "978-0132350884", "Technology");
            book1.displayDetails();

            // 2. Testing Empty ISBN (Should throw InvalidPropertyException)
            System.out.println("\nTesting Empty ISBN Validation...");
            Book book2 = new Book("LIB-202", "Effective Java", "Joshua Bloch", true, "", "Programming");

        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        try {
            // 3. Testing Null Genre (Should throw InvalidPropertyException)
            System.out.println("\nTesting Null Genre Validation...");
            Book book3 = new Book("LIB-203", "The Hobbit", "J.R.R. Tolkien", true, "123456", null);

        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
    }


    /* PLAN/STEPS
        * Book Constructor that invokes the parent constructor using super keyword
        * Getters and Setters to prevent direct modification from outside the class
        * Provide validation in setters
        * use setters in the Book constructor to apply validation
        *
    * Override  checkout(), returnItem(), displayDetails()
        *Provide the Overrides for the above methods from the parent
    *
    * */

    public Book(String itemId, String title, String author, boolean isAvailable, String isbn, String genre) {
        super(itemId, title, author, isAvailable);
        this.setIsbn(isbn);
        this.setGenre(genre);
    }

    //Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn == null || isbn.trim().isEmpty()){
            throw new InvalidPropertyException("ISBN cannot be null or empty!");
        }
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if(genre == null || genre.trim().isEmpty()){
            throw new InvalidPropertyException("Genre cannot be null or empty!");
        }
        this.genre = genre;
    }

    //Override
    @Override
    public void returnItem() {
        super.returnItem();
    }

    @Override
    public void checkout() {
        super.checkout();
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Prints ID, Title, Author, Status
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
    }

}
