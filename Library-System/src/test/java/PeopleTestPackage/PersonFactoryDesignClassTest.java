package PeopleTestPackage;

import Books.Book;
import Books.BookStatus;
import People.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PersonFactoryDesignClassTest {

    @Test
    void howObjectNewInPerson() {

        //Given


        Book book1 = new Book(1000, "fff", "ssss", BookStatus.RELEASED);
        List<Book> borrowedBook = new ArrayList<>();
        borrowedBook.add(book1);
        Person member = new Member(14, "mahdi nami", borrowedBook);

        Person librarian = new Librarian(500, "Amir Nejabati");

        List<Librarian> librarians = new ArrayList<>();

        Person admin = new Admin(1100, "karbalai Hoseini", librarians);

        //When

        //Then

        Assertions.assertEquals(member, PersonFactoryDesignClass.personFactory("member", member.getId(), member.getFullName()));
        Assertions.assertEquals(librarian, PersonFactoryDesignClass.personFactory("librarian", 500, "Amir Nejabati"));
        Assertions.assertEquals(admin, PersonFactoryDesignClass.personFactory("admin", 1100, "karbalai Hoseini"));
    }
}
