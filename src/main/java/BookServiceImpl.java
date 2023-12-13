import java.util.Scanner;

public class BookServiceImpl  implements BookService {
    private final Book[] bookList;
    private final int Maxsize;
    private int size;


    public BookServiceImpl(int maxsize) {

        this.Maxsize = maxsize;
        this.bookList = new Book[maxsize];
        this.size = 0;
    }

    @Override
    public void createBook(Book b) {
        if (size < Maxsize) {
            bookList[size++] = b;
            System.out.println("New Book added");
        } else {
            System.out.println("Max reach");
        }


    }

    @Override
    public void viewBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookList[i]);
        }


    }

    @Override
    public void deleteBook() {
        if (size == 0) {
            System.out.println("No Book to delete.");
            return;
        }
        System.out.println("Current Book:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + bookList[i]);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the student to delete (1-" + size + "): ");
        int indexToDelete = scanner.nextInt();

        if (indexToDelete < 1 || indexToDelete > size) {
            System.out.println("Invalid index. Please enter a valid index.");
            return;
        }

        // Shift elements to remove the selected student
        for (int i = indexToDelete - 1; i < size - 1; i++) {
            bookList[i] = bookList[i + 1];
        }

        bookList[size - 1] = null;  // Remove the reference to the last element
        size--;

        System.out.println("Student at index " + indexToDelete + " deleted successfully.");
    }



    @Override
    public void updateBook() {
        if (size==0){
            System.out.println("No Books to update");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Current Book:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + bookList[i]);
        }

        System.out.print("Enter the index of book (1-" + size + "): ");
        int indexToUpdate = scanner.nextInt();

        if (indexToUpdate < 1 || indexToUpdate > size) {
            System.out.println("Invalid index. Please enter a valid index.");
            return;


    }
        scanner.nextLine();
        System.out.println("Update a Book title");
        String title = scanner.next();
        System.out.println("Update a id");
        int id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Update an author");
        String author = scanner.nextLine();
        System.out.println("Update price ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Update a ISBN");
        int ISBN= scanner.nextInt();

        // Update the student details
        bookList[indexToUpdate - 1] = new Book(title, id,author,price, ISBN);

        System.out.println("Book at index " + indexToUpdate + " updated successfully.");


    }}
