package PowtorzenieWiad25082017.Zad3_Dziedziczenie;

public class Student extends Person {
    private String _program;
    private int _year;
    private double _fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        _program = program;
        _year = year;
        _fee = fee;
    }

    public String getProgram() {
        return _program;
    }

    public void setProgram(String program) {
        _program = program;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int year) {
        _year = year;
    }

    public double getFee() {
        return _fee;
    }

    public void setFee(double fee) {
        _fee = fee;
    }

    public String toString() {
        return String.format("[Student[%s],program=%s,%d,%f]",
                super.toString(), _program, _year, _fee);
    }
}
