package PowtorzenieWiadomosci25082017.Zad3_Dziedziczenie;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void defaultPersonSetAddressGetNameAndAddressTest() {
        Person person = new Person("Janusz", "Muchobronx");
        person.setAddress("Wroclaw");
        Assert.assertEquals("Janusz", person.getName());
        Assert.assertEquals("Wroclaw", person.getAddress());
    }

    @Test
    public void defaultToStringTest() {
        Person person = new Person("Janusz", "Muchobronx");
        Assert.assertEquals("Person[name=Janusz,addres=Muchobronx]", person.toString());
    }
}
