package People;

import Books.Book;

import java.util.ArrayList;
import java.util.List;

public class FactoryDesign {


    //Factory method for member class :
    public static Member memberFactory(String obj, int id, String fullName, ArrayList<Book> borrowedBook) {

        if (obj.toUpperCase().equalsIgnoreCase("member")) {
            if (id >= 3626 && id <= 6626) {
                if (!fullName.isEmpty()) {
                    return new Member(id, fullName, borrowedBook);
                }
            }
        }

        return null;
    }

    //Factory method for librarian class :
    public static Librarian librarianFactory(String obj, int id, String fullName, LibraryData data) {

        if (id >= 300 && id <= 811) {
            if (!fullName.isEmpty()) {
                return new Librarian(id, fullName, data);
            }
        }

        return null;
    }

    //Factory method for admin class :
    public static Admin adminFactory(String obj, int id, String fullName, List<Librarian> librarians) {

        if (id >= 3626 && id <= 6626) {
            if (!fullName.isEmpty()) {
                return new Admin(id, fullName, librarians);
            }
        }

        return null;
    }
}
