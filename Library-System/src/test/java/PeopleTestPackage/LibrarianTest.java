package PeopleTestPackage;

import People.Librarian;
import org.junit.jupiter.api.Test;

public class LibrarianTest extends PersonTest {

    @Test
    public void addBookTestMethodInLibrarianClass(){

        //Given

        Librarian muhamadLibrarian=new Librarian(300, "Muhamad fateh");

        //When

        muhamadLibrarian.getId();
        muhamadLibrarian.getFullName();

        System.out.println(" ");

        //Then

        muhamadLibrarian.manageBook();

    }
}