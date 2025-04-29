import Books.Book;

public interface Borrowable {

    void borrowBook(Book book);

    boolean returnBook(int id);
}
