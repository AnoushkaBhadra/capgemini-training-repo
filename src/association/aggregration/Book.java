package association.aggregration;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private String price;

    public Book(String bookId, String title, String author, String price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getDetails() {
        return "Book Id: " + bookId +
               " | Title: " + title +
               " | Author: " + author +
               " | Price: " + price;
    }
}
