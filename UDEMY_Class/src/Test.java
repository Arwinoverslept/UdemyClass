import java.util.*;

public class Test {
    private String isbn;
    private String title;
    private String author;

    // Constructor
    public Test(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString for displaying book details
    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author;
    }
}

class Library {
    private HashMap<String, Test> bookMap;           // For storing and retrieving books
    private LinkedHashMap<String, Test> orderedMap; // For maintaining insertion order

    // Constructor
    public Library() {
        bookMap = new HashMap<>();
        orderedMap = new LinkedHashMap<>();
    }

    // Add a book to the library
    public void addBook(Test book) {
        bookMap.put(book.getIsbn(), book);
        orderedMap.put(book.getIsbn(), book);
    }

    // Retrieve a book by ISBN
    public Test getBookByIsbn(String isbn) {
        return bookMap.get(isbn);
    }

    // Display all books in insertion order
    public void displayBooksInInsertionOrder() {
        System.out.println("Books in insertion order:");
        for (Test book : orderedMap.values()) {
            System.out.println(book);
        }
    }

    // Display all books sorted by title
    public void displayBooksSortedByTitle() {
        System.out.println("Books sorted by title:");
        List<Test> bookList = new ArrayList<>(bookMap.values());

        // Sort the list by title
        bookList.sort(Comparator.comparing(Test::getTitle));

        for (Test book : bookList) {
            System.out.println(book);
        }
    }
    
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Test("978-0135166307", "Effective Java", "Joshua Bloch"));
        library.addBook(new Test("978-0596009205", "Head First Java", "Kathy Sierra"));
        library.addBook(new Test("978-0321356680", "Java Concurrency in Practice", "Brian Goetz"));

        // Retrieve a book by ISBN
        String isbnToFind = "978-0135166307";
        Test foundBook = library.getBookByIsbn(isbnToFind);
        if (foundBook != null) {
            System.out.println("Retrieved Book: " + foundBook);
        } else {
            System.out.println("Book with ISBN " + isbnToFind + " not found.");
        }

        // Display all books in insertion order
        System.out.println();
        library.displayBooksInInsertionOrder();

        // Display all books sorted by title
        System.out.println();
        library.displayBooksSortedByTitle();
    }
}

