public class Ebook extends Book{

    private String format;
    private int size;
     private double price;

    public Ebook(String title, int id, String author, double price, int ISBN) {
        super(title, id, author, price, ISBN);
    }


    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "Ebook{" +
                "format='" + format + '\'' +
                ", size=" + size +
                ", price=" + price +
                "} " + super.toString();
    }


    }








