import Books.Book;
import Books.BookStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    void testBookReleasedMethod(){

        Book book=new Book(1, "title", "name", BookStatus.BORROWED);

        Assertions.assertEquals(BookStatus.RELEASED, book.areYouBookReleased());
    }
}
