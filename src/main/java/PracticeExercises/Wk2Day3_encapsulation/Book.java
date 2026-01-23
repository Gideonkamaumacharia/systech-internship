package PracticeExercises.Wk2Day3_encapsulation;

import java.time.LocalDate;

public class Book {
    private final String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private LocalDate dueDate;

    public static void main(String[] args) {
        Book book = new Book("9785757597483", "Gladiator", "Maximus Desmus Maridius");
        book.borrowBook();
        book.returnBook();
        book.isOverdue();
    }

    public Book(String isbn, String title, String author)  {
        if(isbn != null && isbn.matches("^\\d{13}$")){
            this.isbn =isbn;
        }else {
            throw new IllegalArgumentException("ISBN must be exactly 13 digits!");
        }
        this.setTitle(title);
        this.setAuthor(author);
        this.isAvailable = true;
        this.dueDate = null;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be empty or null!");
        }else{
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be empty or null!");
        }else{
            this.author = author;
        }

    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void borrowBook(){
        if(isAvailable){
            this.isAvailable = false;
            this.dueDate = LocalDate.now().plusDays(-14);
            System.out.println("Successfully borrowed: "+ getTitle());
            System.out.println("Due date: "+ dueDate);
        }else {
            System.out.println("Sorry, "+ getTitle() + " is currently unavailable.");
            if(dueDate != null){
                System.out.println("It is expected back on: "+ dueDate);
            }
        }

    }

    public void returnBook(){
        this.isAvailable = true;
        this.dueDate = null;
        System.out.println("Thank you for returning: "+ getTitle());
    }

    public boolean isOverdue(){
        if(isAvailable || dueDate == null){
            return false;
        }
        return LocalDate.now().isAfter(dueDate);
    }
}
