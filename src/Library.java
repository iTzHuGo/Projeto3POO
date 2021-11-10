import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Library.
 */
public class Library {
    private ArrayList<Request> requests;
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private Scanner sc = new Scanner(System.in);

    /**
     * Library's constructor
     */
    public Library() {
        this.requests = new ArrayList<>();
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addRequest(Request request) {
        requests.add(request);
    }

    /**
     * Lists all requests on a given date.
     *
     * @param date the date
     */
    public void listRequests(Date date) {
        System.out.println("Requested books on " + date.toString());
        //Goes through the ArrayList and prints out the requests on the given date
        for (Request r : requests) {
            if (r.getReqDate().toString().equals(date.toString()))
                System.out.println(r);
        }
    }

    /**
     * Lists all available books.
     * All books that have not been requested.
     */
    public void listAvailableBooks() {
        System.out.println("Available Books:");
        //Goes through all the books in the ArrrayList and prints out only the available ones (the unrequested ones)
        for (Book b : books) {
            if (!b.isRequested())
                System.out.println(b);
        }
    }

    public void listAllBooks() {
        System.out.println("All Books");
        //Goes through the ArrayList and prints out all the books
        for (Book b : books) {
            System.out.println(b);
        }
    }

    /**
     * Lists all readers.
     */
    public void listReaders() {
        System.out.println("Readers:");
        //Goes through the ArrayList and prints out all the readers
        for (Reader r : readers) {
            System.out.println(r);
        }
    }

    /**
     * Resquests a book with a given reader and dates of request and return.
     *
     * @param r       the reader
     * @param reqDate the request date
     * @param retDate the return date
     * @return the request
     */
    public Request requestBook(Reader r, Date reqDate, Date retDate) {
        Book book = null;
        Request request;

        System.out.println("Requesting a book...");
        System.out.println("Please state the title of an available book");
        listAvailableBooks();
        String titleInput = sc.nextLine();
        //Goes through the ArrayList and saves the book that matches the title and isn't requested
        for (Book b : books) {
            if (titleInput.equals(b.getTitle()) && !b.isRequested()) {
                book = b;
                break;
            }
        }

        assert book != null;
        request = new Request(r, book, reqDate, retDate);
        System.out.println("Book requested successfully");
        return request;
    }

    /**
     * Gets a book by title.
     * Title is not case sensitive.
     *
     * @param title the title
     * @return the book
     * @return null if the book is not present in the ArrayList Book
     */
    public Book getBook(String title) {
        //Goes through the ArrayList and checks if the title is the same as the one currently on the for cycle
        //Not case sensitive
        for (Book b : books) {
            if (b.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return b;
            }
        }
        return null;
    }

    /**
     * Gets reader.
     * While not being case sensitive
     *
     * @param name the name
     * @return the reader
     */
    public Reader getReader(String name) {
        Reader reader = null;
        //Goes through the ArrayList and checks if the name is the same as the one currently on the for cycle
        //Not case sensitive
        for (Reader r : readers) {
            if (r.getName().toLowerCase().equals(name.toLowerCase())) {
                reader = r;
            }
        }
        return reader;
    }

    @Override
    public String toString() {
        return "Requests= " + requests +
                "\n Books= " + books +
                "\n Readers= " + readers;
    }
}
