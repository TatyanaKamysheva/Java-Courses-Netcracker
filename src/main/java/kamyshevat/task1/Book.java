package kamyshevat.task1;

public class Book {

    String name;
    Author[] authors;
    double price;
    int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String str = "";
        for (Author athr : authors) {
            str += athr.toString() + "; ";
        }
        return "Book[name=" + name + ", authors={" + str + "}, price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorName() {
        String str = "";
        for (Author athr : authors) {
            str += athr.getName() + "; ";
        }
        return str;
    }
}
