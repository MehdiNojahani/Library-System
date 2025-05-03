package PeopleTestPackage;

import Books.Book;
import BooksTestPackage.BookTest;
import People.Member;
import PeopleTestPackage.PersonTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MemberTest extends PersonTest {

    @Test
    public void borrowBookTestMethod() {


        //Given
        BookTest bookTest = new BookTest();

        List<Book> memberBookList = new ArrayList<>();

        memberBookList.add(bookTest.book1);
        memberBookList.add(bookTest.book2);

        Member member1 = new Member(1, "Mehdi Nazmi", memberBookList);

        //When

        member1.borrowBook(bookTest.book2);

        //Then

        Assertions.assertEquals(bookTest.book2, member1.returnBook(2));
    }

}
