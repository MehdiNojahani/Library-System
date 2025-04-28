public class Person {
    //instance variable for id and full name Person
    private int id;
    private String fullName;

    //Constructor
    public Person(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0)
            this.id = id;
        else
            System.out.println("Error");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isEmpty())
            this.fullName = fullName;
        System.out.println("Error name");
    }

}
