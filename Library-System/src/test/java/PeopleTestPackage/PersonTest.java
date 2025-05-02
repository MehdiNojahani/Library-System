package PeopleTestPackage;

import People.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {


    @Test
    public void personDetailTest() {


        //Given
        Person person = new Person(1, "Hossein Nami");

        //When
        String resName = person.getFullName();
        int resId = person.getId();

        //Then
        Assertions.assertEquals(1, resId);
        Assertions.assertEquals("Hossein Nami", resName);

    }
}

