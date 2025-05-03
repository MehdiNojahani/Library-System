package People;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person{

    List<Librarian> librarianList=new ArrayList<>();

    public Admin(int id, String fullName, List<Librarian> librarianList) {
        super(id, fullName);
        this.librarianList=librarianList;
    }


    public void manageLibrarian(){}


    private void addLibrarian(){


    }
}
