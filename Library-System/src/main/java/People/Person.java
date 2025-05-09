package People;

import java.util.Objects;

public class Person<T> {
    //instance variable for id and full name People.Person
    private int id;
    private String fullName;

    private T extraData;

    public T getExtraData() {
        return extraData;
    }

    public void setExtraData(T extraData) {
        this.extraData = extraData;
    }

    //Constructor
    public Person(int id, String fullName, T extraData) {
        this.id = id;
        this.fullName = fullName;
        this.extraData=extraData;
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

    @Override
    public String toString() {

        return "Person id : " + getId()
                + "Person Full Name : " + getFullName();
    }

    //Override equals() and hashCode() method for comparison two object
    // (needs override for test and comparison in PersonFactoryDesignClass class and PersonFactoryDesignClassTest class)
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;

        Person person= (Person) obj;
        return person.getId() == id &&
                person.getFullName().equals(fullName);
    }

    //Override equals() and hashCode() method for comparison two object in hash list set and map
    // (needs override for test and comparison in PersonFactoryDesignClass class and PersonFactoryDesignClassTest class)
    @Override
    public int hashCode() {
        return Objects.hash(id, fullName);
    }
}
