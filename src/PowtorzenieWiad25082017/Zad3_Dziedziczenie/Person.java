package PowtorzenieWiad25082017.Zad3_Dziedziczenie;

public class Person {
    private String _name;
    private String _address;

    public Person(String name, String address) {
        _name = name;
        _address = address;
    }

    public String getName() {
        return _name;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String toString() {
        return String.format("Person[name=%s,addres=%s]", _name, _address);
    }
}
