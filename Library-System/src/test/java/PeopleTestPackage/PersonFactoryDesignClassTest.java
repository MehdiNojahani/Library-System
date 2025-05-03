package PeopleTestPackage;

import Books.Book;
import Books.BookStatus;
import People.Librarian;
import People.Member;

import People.Person;
import People.PersonFactoryDesignClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonFactoryDesignClassTest {

    @Test
    void howObjectNewInPerson() {

        //Given


        Book book1 = new Book(1000, "fff", "ssss", BookStatus.RELEASED);
        List<Book> borrowedBook = new ArrayList<>();
        borrowedBook.add(book1);
        Person member = new Member(14, "mahdi nami", borrowedBook);

        Person librarian=new Librarian(500, "Amir Nejabati");

        //When



        //Then

        Assertions.assertEquals(member , PersonFactoryDesignClass.personFactory("member", member.getId(), member.getFullName()));
        Assertions.assertEquals(librarian, PersonFactoryDesignClass.personFactory("librarian", 500, "Amir Nejabati"));

    }
}
