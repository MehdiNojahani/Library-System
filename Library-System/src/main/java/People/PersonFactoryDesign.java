package People;

import java.util.ArrayList;

public class PersonFactoryDesignClass {

    public static Person personFactory(String obj, int id, String fullName){

        String person="person";
        String librarian="librarian";
        String member="member";
        String admin="admin";


        if (obj.toLowerCase().equalsIgnoreCase(person)){
            return new Person(id, fullName);
        } else if (obj.toLowerCase().equalsIgnoreCase(librarian)) {
            return new Librarian(id, fullName);
        } else if (obj.toLowerCase().equalsIgnoreCase(member)) {
            return new Member(id, fullName, new ArrayList<>());
        } else if (obj.toLowerCase().equalsIgnoreCase(admin)) {
            return new Admin(id, fullName, new ArrayList<>());
        }

        return null;

    }
}
