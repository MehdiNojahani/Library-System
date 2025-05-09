package PeopleTestPackage;

import Books.Book;
import Books.BookStatus;
import People.FactoryDesign;
import People.Member;
import People.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FactoryDesignTest {

    @Test
    void callCorrectClass(){

        Book book1=new Book(12, "hhh", "lll", BookStatus.RELEASED);
        Book book2=new Book(13, "mmm", "sss", BookStatus.RELEASED);

        ArrayList<Book> borrowedBook=new ArrayList<>();
        borrowedBook.add(book1);
        borrowedBook.add(book2);

        Person person1=new Member(3626, "madi bagi", borrowedBook);

        Assertions.assertEquals(person1, FactoryDesign.memberFactory("member", person1.getId(),
                person1.getFullName(), borrowedBook));
    }
}
