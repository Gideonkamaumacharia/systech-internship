package Assement2_Gideon_Kamau;

public class Book{

    private String title;
    private String author;
    private String isbn;
    private int price;
    private boolean isAvailable;

    public Book(String title,String author,String isbn,int price,boolean isAvailable){
        this.setTitle(title);
        this.setAuthor(author);
        this.setIsbn(isbn);
        this.setPrice(price);
        this.setAvailable(isAvailable);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be empty and must not be null!");
        }else{
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be empty and must not be null!");
        }else{
            this.author = author;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn != null && isbn.matches("[A-Za-z0-9]{13}")){
            this.isbn = isbn;
        }else{
            throw new IllegalArgumentException("ISBN must be exactly 13 digits and must not be null!");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price >= 0){
            this.price = price;
        }else {
            throw new IllegalArgumentException("Price cannot be negative!");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        System.out.println("The title of the book is " + getTitle());
        System.out.println("The author of the book " + getTitle() + " is " + getAuthor());
        System.out.println(getIsbn() + " is the book ISBN. " + " The book costs Kshs " + getPrice());
        return " ";
    }

    public void borrowBook(){
        if(isAvailable){
            this.isAvailable = false;
            System.out.println("Successfully borrowed "+ getTitle()+" !");

        }else{
            System.out.println(getTitle()+ " is not available.");
        }
    }

    public void returnBook(){
        this.isAvailable = true;
        System.out.println("Thank you for returning "+getTitle());
    }

    public static void main(String[] args) {
        System.out.println(new Book("Before the Rooster Crows","Peter Kimani","1234567890123",1500,true).toString());

        new Book("Before the Rooster Crows","Peter Kimani","1234567890123",1500,true).borrowBook();
        new Book("Before the Rooster Crows","Peter Kimani","1234567890123",1500,true).returnBook();
    }
}
