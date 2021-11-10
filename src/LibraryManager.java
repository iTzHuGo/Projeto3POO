import java.util.Scanner;

/**
 * The type Library manager.
 */
public class LibraryManager {
    private static Library library = new Library();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadInfo();
        userInterface();
    }
    //User Interface
    private static void userInterface() {
        int option = -1;

        //Prints the various options
        System.out.println("1. Add a Book");
        System.out.println("2. Add a Reader");
        System.out.println("3. Make a Request");
        System.out.println("4. List all available books");
        System.out.println("5. List all requests on a given date");
        System.out.println("6. List all Readers");
        System.out.println("7. List all Books");
        System.out.println("0. Exit");

        //Checks for valid input
        if (sc.hasNextInt()) {
            //If option is 0 then it's the Exit
            while (option != 0) {
                //Assigns the user input to the variable while (casting) the value to int
                option = Integer.parseInt(sc.nextLine());
                if (option > 7) {
                    System.out.println("Please only input a valid number");
                    userInterface();
                }

                //Switch Case for the menu
                switch (option) {
                    case 1 -> addBook();
                    case 2 -> addReader();
                    case 3 -> addRequest();
                    case 4 -> listAvailable();
                    case 5 -> listRequests();
                    case 6 -> listReaders();
                    case 7 -> listBooks();
                }
            }
        } else System.out.println("Please type a valid option");
    }
    //Adds a Book to the library
    private static void addBook() {
        //Assigns the user input to the variable title
        System.out.print("State the Book's title: ");
        String title = sc.nextLine();

        //Assigns the user input to the variable author
        System.out.print("\nState the Book author: ");
        String author = sc.nextLine();

        //Creates a new Book object and adds it to the Book ArrayList
        library.addBook(new Book(title, author, false));

        Book b = library.getBook(title);
        //Checks if there was any problem assigning the object to the variable
        if (b != null)
            System.out.println("Book successfully added (title: '" + b.getTitle() + '\'' + " author: '" + b.getAuthor() + '\'' + ")");
        else System.out.println("An error has occurred while adding the book to the library.");
        //Returns to the userInterface (menu)
        userInterface();
    }
    //Adds a Reader to the library
    private static void addReader() {
        //Assigns the user input to the variable name
        System.out.print("State the Reader's name: ");
        String name = sc.nextLine();
        //Creates an object and adds it to the Reader ArrayList
        library.addReader(new Reader(name));
        Reader r = library.getReader(name);
        //Checks for any errors that might have happened
        if (r != null)
            System.out.println("Reader successfully added (name: '" + r.getName() + '\'' + " id: '" + r.getId() + '\'' + ')');
        else System.out.println("An error has occurred while adding the reader to the library.");
        //Returns to the userInterface (menu)
        userInterface();
    }
    //Adds a Request to the library
    private static void addRequest() {
        //Starts a variable r of Reader as null
        Reader r = null;
        //While the reader's name is invalid it keeps prompting the user to enter a name
        while (r == null) {
            System.out.println("State the Reader's name: ");
            String name = sc.nextLine();
            r = library.getReader(name);
            if (r == null)
                System.out.println("Reader doesn't exist");
        }
        //Starts a variable b of Book as null
        Book b = null;
        //While the book's title is invalid it keeps prompting the user to enter a title
        while (b == null) {
            System.out.println("State the Book's title");
            String title = sc.nextLine();
            b = library.getBook(title);
            if (b == null)
                System.out.println("Book doesn't exist");
        }

        //Prompts the user to enter a request date in a certain format
        System.out.println("State the request date (DD/MM/YYYY)");
        //Validates the date inputs
        Date requestDate = getDateFromInput();

        //Prompts the user to enter a return date in a certain format
        System.out.println("State the return date (DD/MM/YYYY)");
        //Validates the date inputs
        Date returnDate = getDateFromInput();

        //Checks if the return date is after the request date
        //If it isn't then it restarts the process by returning to the User Interface
        if (!returnDate.isBigger(returnDate, requestDate)) {
            System.out.println("Return date isn't after request date");
            userInterface();
        }

        //If it all goes well, it creates a Request object and adds it to the ArrayList Request
        library.addRequest(new Request(r, b, requestDate, returnDate));
        System.out.println("Request made successfully");

        //Back to the menu
        userInterface();
    }
    //Gets date from input and validates it
    private static Date getDateFromInput() {
        //Assigns the user input to a String date
        String date = sc.nextLine();
        //then splits it by '/'
        String[] d = date.split("/");

        //Assigns day month and year the correct values
        int day = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int year = Integer.parseInt(d[2]);
        //A new date object is created
        Date date1 = new Date(day, month, year);

        //While it isn't valid it prompts the user to re type the date
        while (!date1.isDateValid(date1)) {
            System.out.println("Given date is not valid");
            date = sc.nextLine();
            d = date.split("/");
            day = Integer.parseInt(d[0]);
            month = Integer.parseInt(d[1]);
            year = Integer.parseInt(d[2]);
            date1 = new Date(day, month, year);
        }
        return date1;
    }

    private static void listAvailable() {
        library.listAvailableBooks();
        userInterface();
    }

    private static void listBooks() {
        library.listAllBooks();
        userInterface();
    }

    //List all requests on a specific date
    private static void listRequests() {
        System.out.println("State the request date (DD/MM/YYYY)");
        //Validates the input
        Date requestDate = getDateFromInput();
        if (!requestDate.isDateValid(requestDate)) {
            System.out.println("Given date is not valid");
            userInterface();
        }
        //Lists all requests on the given date
        library.listRequests(requestDate);
        userInterface();
    }

    private static void listReaders() {
        library.listReaders();
        userInterface();
    }
    //Loads info
    private static void loadInfo() {
        Book book1 = new Book("Os Lusíadas", "Luís de Camões", false);
        Book book2 = new Book("Os Maias", "Nicholas Cage", false);
        Book book3 = new Book("Dei", "Edmundo", false);
        Reader reader1 = new Reader("Samuel");
        Reader reader2 = new Reader("Quim Barreiros");
        Reader reader3 = new Reader("Jonas");
        Date d1 = new Date(17, 10, 2021);
        Date d2 = new Date(17, 11, 2021);
        Request request1 = new Request(reader1, book1, d1, d2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);
        library.addRequest(request1);
    }
}