package association.aggregration;

public class LibraryUser {
    public static void main(String[] args) {

        Library library = new Library();

        library.setName("ABC Library");
        library.setLocation("Mumbai");
        library.setAddress("Mumbai");
        library.setPincode("86456");

        Book[] books = library.createBookArray(4);

        books[0] = new Book("1", "Harry Potter and Chamber of Secrets", "J.K. Rowling", "250");
        books[1] = new Book("2", "Sherlock Holmes", "Arthur Conan", "600");
        books[2] = new Book("3", "Perfect Murder", "Ruskin Bond", "400");
        books[3] = new Book("4", "No Exit", "Taylor Adams", "700");

        System.out.println(library.getLibraryDetails());
        System.out.println("===================================================");

        for (Book b : books) {
            System.out.println(b.getDetails());
        }
    }
}