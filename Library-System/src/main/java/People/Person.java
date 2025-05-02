package People;

public class Person {
    //instance variable for id and full name People.Person
    private int id;
    private String fullName;

    //Constructor
    public Person(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0)
            this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isEmpty())
            this.fullName = fullName;
    }

}
