package Assement3_Gideon_Kamau.Problem3.Books;

import Assement3_Gideon_Kamau.Problem3.Books.Exceptions.InvalidAuthorException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidPriceException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidProductDataException;
import Assement3_Gideon_Kamau.Problem3.Product;
import Assement3_Gideon_Kamau.Problem3.ProductType;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * The Book class represents a specific type of product in our inventory.
 * It extends the abstract Product class and implements specific logic for
 * book-related data validation and discount calculations.
 */
public class Books extends Product {
    private String author;
    private String publisher;
    private String isbn;
    private LocalDate publicationDate;

    /*
     * Constructor for Book.
     * It invokes the parent Product constructor and uses setters to ensure
     * that all data passed during instantiation is validated immediately.
     */
    public Books(String productId, String productName, double basePrice, int stockLevel,
                String author, String publisher, String isbn, LocalDate publicationDate) throws InvalidPriceException {

        super(productId, productName, stockLevel,basePrice, ProductType.BOOKS);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
        this.setPublicationDate(publicationDate);
    }

    /**
     * Test class to demonstrate the Book system implementation.
     * It covers successful instantiation, logic calculations, and
     * comprehensive exception handling as required.
     */

        public static void main(String[] args) {
            System.out.println("--- Starting E-Commerce Product System Test ---\n");

            try {
                /*
                 * SCENARIO 1: Successful Book Creation
                 * Testing a book older than 12 months to trigger the extra discount logic.
                 */
                System.out.println("TEST 1: Valid Book Creation and Calculation");
                LocalDate backLogDate = LocalDate.now().minusMonths(14);

                Books validBook = new Books("PRDCT-101", "Clean Code", 1500.0, 20, "Robert C. Martin", "Pearson", "978-0132350884", backLogDate
                );

                validBook.displayProductInfo();
                // This will show: 10% base discount + 50.0 backlog incentive

                /*
                 * SCENARIO 2: Validating Product Data (Exception Handling)
                 * Attempting to create a book with an invalid (empty) author.
                 */
                System.out.println("\nTEST 2: Triggering Data Validation (Invalid Author)");
                Books invalidBook = new Books(
                        "PRDCT-102",
                        "Java Programming",
                        1200.0,
                        10,
                        null, // Invalid: should trigger Exception
                        "Oracle Press",
                        "123-4567890",
                        LocalDate.now()
                );

            } catch (InvalidAuthorException iae) {
                /*
                 * This catches errors from setAuthor, setIsbn, etc.
                 * fulfilling the 'Demonstrate comprehensive exception handling' requirement.
                 */
                System.out.println("Validation Error Caught: " +iae.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

            try {
                /*
                 * SCENARIO 3: Validating Price Data
                 * Attempting to set a negative price.
                 */
                System.out.println("\nTEST 3: Triggering Data Validation (Negative Price)");
                Books priceTest = new Books("PRDCT-103", "Test", -10.0, 5, "A", "P", "I", LocalDate.now());

            } catch (InvalidPriceException e) {
                System.out.println("Price Error Caught: " + e.getMessage());
            }

            System.out.println("\n--- Product System Test Completed ---");
        }



    /*
     * Implementation of the abstract calculateDiscount method.
     * Logic: A base 10% discount is applied. If the book was published
     * more than 12 months ago (Backlog), an additional discount is applied.
     */
    @Override
    public double calculateDiscount() {
        final double PERCENT_DISCOUNT = 0.10;
        final double BACKLOG_INCENTIVE_DISCOUNT = 50.0;
        final long AGE_THRESHOLD_MONTHS = 12L;

        double discountAmount = getBasePrice() * PERCENT_DISCOUNT;

        // Calculate age of the book in months
        long monthsSincePublished = ChronoUnit.MONTHS.between(this.publicationDate, LocalDate.now());

        // If the book is older than the threshold, apply extra discount
        if (monthsSincePublished > AGE_THRESHOLD_MONTHS) {
            discountAmount += BACKLOG_INCENTIVE_DISCOUNT;
        }
        return discountAmount;
    }

    /*
     * Concrete implementation of getProductType required by the parent class.
     */
    @Override
    public ProductType getProductType() {
        return ProductType.BOOKS;
    }

    /*
     * Overrides displayProductInfo to include Book-specific details
     * like Author and ISBN alongside the standard product data.
     */
    @Override
    public void displayProductInfo() {
        super.displayProductInfo(); // Print common data
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------------------------------");
    }

    // --- Getters and Setters with Validation ---

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new InvalidAuthorException("Author name cannot be empty.");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.trim().isEmpty()) {
            throw new InvalidProductDataException("Publisher cannot be empty.");
        }
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    /*
     * Validates that the ISBN is provided.
     */
    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new InvalidProductDataException("ISBN is required for books.");
        }
        this.isbn = isbn;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        if (publicationDate == null || publicationDate.isAfter(LocalDate.now())) {
            throw new InvalidProductDataException("Invalid publication date.");
        }
        this.publicationDate = publicationDate;
    }
}
