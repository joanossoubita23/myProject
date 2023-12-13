import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BookService BookService = new BookServiceImpl(20);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    Welcome to My Library
                    1-Create a book
                    2-View a book
                    3-Update a book
                    4-Delete a Book
                    5- Exit..
                    """);
            System.out.println("Enter a choice");
            choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter a Book title");
                    String title = scanner.next();
                    System.out.println("Enter a id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter an author");
                    String author = scanner.nextLine();
                    System.out.println("Enter price ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter a ISBN");
                    int ISBN = scanner.nextInt();
                    BookService.createBook(new Book(title, id, author, price, ISBN));
                    break;

                case 2:
                    BookService.viewBooks();
                    break;
                case 3:
                    BookService.updateBook();
                    break;
                case 4:
                    BookService.deleteBook();
                    break;
                case 5:
                    System.out.println("Good by see you next time");
                default:
                    System.out.println("Wrong input can you try again");
            }

        } while (choice != 5);


    }
}
