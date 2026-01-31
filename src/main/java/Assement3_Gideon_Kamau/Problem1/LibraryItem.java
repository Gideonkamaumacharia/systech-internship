package Assement3_Gideon_Kamau.Problem1;

import Assement3_Gideon_Kamau.Problem1.Exceptions.InvalidItemIDException;
import Assement3_Gideon_Kamau.Problem1.Exceptions.InvalidPropertyException;

public class LibraryItem {
    //private fields/properties
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;//Initialized boolean to true

    public static void main(String[] args) {
        System.out.println("--- Testing LibraryItem Base Logic ---");
        try {
            // 1. Valid Creation & State Toggle
            LibraryItem item = new LibraryItem("LIB-100", "Computer Science", "Joshua Bloch", true);
            item.displayDetails();
            item.checkout();   // Should succeed
            item.checkout();   // Should show Error: currently unavailable
            item.returnItem(); // Should succeed
            item.returnItem(); // Should show Error: already in library

            // 2. Testing ID Validation (Should throw InvalidItemIDException)
            System.out.println("\nTesting Invalid ID Prefix...");
            LibraryItem invalidItem = new LibraryItem("BOOK-101", "The Great Gatsby", "Paul Coelho", true);

        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
    }


    //libraryItem constructor

    public LibraryItem(String itemId, String title, String author, boolean isAvailable) {
        this.setItemId(itemId);
        this.setTitle(title);
        this. setAuthor(author);
        this.setAvailable(isAvailable);
    }

    //Getters and Setters

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        if (itemId != null && itemId.startsWith("LIB-")) {
            this.itemId = itemId;
        } else {
            throw new InvalidItemIDException("Invalid ID: Must start with 'LIB-'");
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new InvalidPropertyException("Title cannot be null or empty!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty()){
            throw new InvalidPropertyException("Author cannot be null or empty!");
        }
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    /*METHODS
        *checkOut()
        * Its primary purpose is to manage the availability logic through the isAvailable property.
        * If isAvailable is already false, the method will notify the user that the item cannot be checked out.
        * If the item is available, the method will set the boolean to false
        * Then it will provide a success message confirming the item title and ID that was checked out
     *
        *displayDetails()
        * The displayDetails() method is used to print all the information about an item to the console in a readable format.
        *
            *returnItem()
            * reverses the checkOut process by updating the item's status back to available
            * Check if isAvailable is already true.
            * If it is already available, notify the user that the item wasn't checked out
                * (this prevents "returning" an item that is already in the library).
            * Provide a confirmation message so the user knows the return was recorded successfully in the system
     *
     */

    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Item '" + title + "' (ID: " + itemId + ") has been checked out.");
        } else {
            System.out.println("Error: '" + title + "' is currently unavailable.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Item '" + title + "' has been returned successfully.");
        } else {
            System.out.println("Error: '" + title + "' is already in the library.");
        }
    }

    public void displayDetails() {
        System.out.println("--- Item Details ---");
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isAvailable ? "Available" : "Checked Out")); //ternary operator to display status
    }
}
