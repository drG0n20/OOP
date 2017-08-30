package PowtorzenieWiadomosci25082017.Zad2_Kompozycja_i_Agregacja;

public class Person {
    private String _name;
    private String _surname;
    private String _PESEL;
    private char _gender;
    private birthDay _birthday;

    public Person(String name, String surname, String PESEL) {
        _name = name;
        _surname = surname;
        _PESEL = PESEL;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getSurname() {
        return _surname;
    }

    public void setSurname(String surname) {
        _surname = surname;
    }

    public String get_PESEL() {
        return _PESEL;
    }

    public void setPESEL(String PESEL) {
        _PESEL = PESEL;
    }
}
