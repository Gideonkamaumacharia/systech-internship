package PracticeExercises.Wk3Day3.Library;

import PracticeExercises.Wk3Day3.Library.Exceptions.BookAuthorNotNullException;
import PracticeExercises.Wk3Day3.Library.Exceptions.BookMustHaveTitleException;

import java.util.*;

public class Library {
    private String name;
    private String location;
    //private Map<Integer,LibraryMember> members  = new HashMap<>();
    private List<LibraryMember> members = new ArrayList<>();
    public static Set<Book> inventory = new HashSet<>();    //Books in the library


    public static void main(String[] args) throws BookMustHaveTitleException {
        Scanner scanner = new Scanner(System.in);

        //Adding a few books to the inventory
        inventory.add(new Book("94930220","The Blossoms Of The Savannah","H.R Ole Kulet",true));
        inventory.add(new Book("94938990","The River and The Source","Margret A. Ogolla",false));



        Library library = new Library("Creative Library","Nairobi");
//        library.addBook(scanner);
//        library.registerMember(scanner);

        //testing adding a book to a list of borrowed books -->Since LibraryMember is not static,we need an object of the outer class
        LibraryMember member = library.new LibraryMember(01,"Karanch");
        member.borrowBooks(scanner);


    }

    public Library(){

    }


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
     * method to find a book in library
     *
     * **/

    Scanner scanner = new Scanner(System.in);

    //Add book
    public void addBook(Scanner scanner){
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        if(isbn == null || isbn.trim().isEmpty()){
            System.out.print("ISBN cannot be empty or null!");
        }
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        if(title == null || title.trim().isEmpty()){
            System.out.print("Title cannot be empty or null!");
        }
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        if(author == null || author.trim().isEmpty()){
            System.out.print("Author cannot be empty or null!");
        }

        Book newBook = new Book(isbn,title,author,true);

        inventory.add(newBook);
        System.out.println("Book added to the library successfully .");
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
        //scanner.close();
    }

    //method to find a book in the library
    public Book findBookInLibrary(String title,String author){
        for(Book book : inventory){
            if(book.title.equalsIgnoreCase(title) && book.author.equalsIgnoreCase(author)){
                System.out.println("Book found!");
                return book;
            }
        }
        System.out.println("Book not in the inventory.");
        return null;
    }

    static class Book{
        //isbn, title, author, isAvailable
        private String isbn;
        private String title;
        private  String author;
        private boolean isAvailable = true;



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

        //Constructor overloading
        public Book(String title,String author){
            if(title == null || title.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be null or empty!");
            }
            this.title = title;
            if(author == null || author.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be null or empty!");
            }
            this.author = author;
        }

        /**
         * a method to borrow a book
         * a method to return a book
         * **/

        public void borrowBook(){
            isAvailable = false;
        }

        public void returnBook(){
            isAvailable = true;
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

        public void borrowBooks(Scanner scanner) throws BookMustHaveTitleException {
            System.out.println("=======  LIBRARY USER INTERFACE ========");

            System.out.println("Enter the title of the book you want to borrow: ");
            String title = scanner.nextLine();
            if(title == null || title.trim().isEmpty()){
                throw new BookMustHaveTitleException("Book must have title!");
            }

            System.out.println("Enter the name of the author: ");
            String author = scanner.nextLine();
            if(author == null || author.trim().isEmpty()){
                throw new BookAuthorNotNullException("ID must be a positive number!");
            }

            Library library = new Library();

            Book foundBook = library.findBookInLibrary(title,author);

            if(foundBook == null){
                System.out.println("Error: We dont have that book in the system!");
            }
            else if(!foundBook.isAvailable){
                System.out.println("Book found in the system but currently not available.");
            }
            else{
                foundBook.borrowBook();
                borrowedBooks.add(foundBook);
                System.out.println(name+ " successfully added "+ title + "  to the list of borrowed books." );
                System.out.println(name+ " successfully borrowed a book!");
            }
        }

    }





}
