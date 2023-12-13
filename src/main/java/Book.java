public class Book {
 //
    // id title,author, price, isbn
    private String title;
    private int id;

    public Book(String updatedBook) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    private String author;
    private double price;
    
     private int ISBN;

    public Book(String title, int id, String author, double price, int ISBN) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", ISBN=" + ISBN +
                '}';
    }
}


    

    





