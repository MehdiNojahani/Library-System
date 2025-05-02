package BooksTestPackage;

import Books.Book;
import Books.BookStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    //Given
    public Book book1 =new Book(1, "title1", "name1", BookStatus.RELEASED);
    public Book book2=new Book(2, "title2", "name2", BookStatus.BORROWED);

    //When
    String t="title1";

    @Test
    void testBookReleasedMethod(){

        //Then
        Assertions.assertEquals(t, book1.getTitle());
    }
}
