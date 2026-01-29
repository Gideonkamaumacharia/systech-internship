package PracticeExercises.Wk3Day3.Library;

import org.w3c.dom.ls.LSOutput;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Library {
    private String name;
    private String location;
    //private Map<Integer,LibraryMember> members  = new HashMap<>();
    private List<LibraryMember> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library("Creative Library","Nyahururu");
        library.addBook(scanner);
        library.registerMember(scanner);
    }

    //Books in the library
    private List<Book> books = new ArrayList<>();


    public Library(String name, String location) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
        this.name = name;
        if(location == null || location.trim().isEmpty()){
            throw new IllegalArgumentException("Location cannot be null or empty!");
        }
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * Add a scanner to grab the user input;
     *          Compare the input with books in library;
     *method to register a member
     * **/

    Scanner scanner = new Scanner(System.in);

    //Add book
    public void addBook(Scanner scanner){
        System.out.println("Enter ISBN: ");
        String isbn = scanner.nextLine();
        if(isbn == null || isbn.trim().isEmpty()){
            System.out.print("ISBN cannot be empty or null!");
        }
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        if(title == null || title.trim().isEmpty()){
            System.out.print("Title cannot be empty or null!");
        }
        scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        if(author == null || author.trim().isEmpty()){
            System.out.print("Author cannot be empty or null!");
        }

        Book newBook = new Book(isbn,title,author,true);

        books.add(newBook);
        System.out.print("Book added successfully to the library.");
    }

    public void registerMember(Scanner scanner){
        System.out.print("Enter library user: ");
        String name = scanner.nextLine();
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        if(memberId < 0 ) {
            throw new IllegalArgumentException("memberId must be positive!");
        }

        LibraryMember member = new LibraryMember(memberId,name);
        members.add(member);
        System.out.println("User "+ name + " registered successfully!");
    }


    static class Book{
        //isbn, title, author, isAvailable
        private String isbn;
        private String title;
        private  String author;
        private boolean isAvailable;

        /**
         * a method to borrow a book
         * a method to return a book
         * **/

        public Book(String isbn, String title, String author, boolean isAvailable) {
            if(isbn == null || isbn.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be null or empty!");
            }
            this.isbn = isbn;
            if(title == null || title.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be null or empty!");
            }
            this.title = title;
            if(author == null || author.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be null or empty!");
            }
            this.author = author;
            this.isAvailable = isAvailable;
        }

    }

    class LibraryMember{
        private int memberId;
        private String name;
        private List< Book > borrowedBooks = new ArrayList<>();

        public LibraryMember(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }

        /**
         * we need a method to add a book to a list of borrowed books
         * miximum books that can e borrowed
         *
         * **/



        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public void addBooks(){

    }



}
