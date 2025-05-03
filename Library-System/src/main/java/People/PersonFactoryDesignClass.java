package People;

import People.Admin;
import People.Librarian;
import People.Member;
import People.Person;

import java.util.ArrayList;

  public class PersonFactoryDesignClass {

    public static Person personFactory(String obj, int id, String fullName){


        if (obj.equalsIgnoreCase("person")){
            return new Person(id, fullName);
        } else if (obj.equalsIgnoreCase("librarian")) {
            return new Librarian(id, fullName);
        } else if (obj.equalsIgnoreCase("member")) {
            return new Member(id, fullName, new ArrayList<>());
        } else if (obj.equalsIgnoreCase("admin")) {
            return new Admin(id, fullName, new ArrayList<>());
        }

        return null;

    }
}
