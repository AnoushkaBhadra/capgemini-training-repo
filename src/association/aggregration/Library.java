package association.aggregration;

public class Library {

    private String name;
    private String location;
    private String address;
    private String pincode;
    private Book[] books;   // aggregation

    public Book[] createBookArray(int size) {
        books = new Book[size];
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Book[] getBooks() {
        return books;
    }

    public String getLibraryDetails() {
        return "Name: " + name +
               " | Location: " + location +
               " | Address: " + address +
               " | Pincode: " + pincode;
    }

}
