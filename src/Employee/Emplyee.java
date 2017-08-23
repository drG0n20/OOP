package Employee;

public class Emplyee {
    private int _id;
    private String _firstName;
    private String _lastName;
    private int _salary;

    public Emplyee(int id, String firstName, String lastName, int salary) {
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _salary = salary;
    }

    public int getID() {
        return _id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getName() {
        return (_firstName + " " + _lastName);
    }

    public int getSalary() {
        return _salary;
    }

    public void setSalary(int salary) {
        _salary = salary;
    }

    public int getAnnualSalary() {
        return _salary * 12;
    }

    public int raiseSalary(int percent) {
        _salary = (int) (_salary + _salary * (percent / 100d));
        return _salary;
    }

    public String toString() {
        return String.format("Employee[id=%d, name=%s, salary=%d]", getID(), getName(), getSalary());
    }
}
