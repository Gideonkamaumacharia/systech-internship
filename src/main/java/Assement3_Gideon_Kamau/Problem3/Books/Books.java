package Assement3_Gideon_Kamau.Problem3.Books;

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
    private LocalDate publicationDate; // Used to simulate the date-based discount logic requested

    /*
     * Constructor for Book.
     * It invokes the parent Product constructor and uses setters to ensure
     * that all data passed during instantiation is validated immediately.
     */
    public Books(String productId, String productName, double basePrice, int stockLevel,
                String author, String publisher, String isbn, LocalDate publicationDate) throws InvalidPriceException {

        super(productId, productName, (int) basePrice, stockLevel, ProductType.BOOKS);

        // Use local setters for validation
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
        this.setPublicationDate(publicationDate);
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
            throw new InvalidProductDataException("Author name cannot be empty.");
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
     * (Extended validation for ISBN length could be added here).
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
