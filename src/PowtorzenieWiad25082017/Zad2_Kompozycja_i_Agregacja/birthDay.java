package PowtorzenieWiad25082017.Zad2_Kompozycja_i_Agregacja;

public class birthDay {
    private String _PESEL;
    private char _gender;
    private int _day;
    private int _month;
    private int _year;

    public birthDay(String PESEL) {
        _PESEL = PESEL;
    }

    public char genderGenerator() {
        char gender = _PESEL.charAt(9);
        if (gender % 2 == 0) {
            return 'f';
        } else {
            return 'm';
        }
    }

    public char getGender() {
        return genderGenerator();
    }

    public int yearGenerator() {
        String substringyear = _PESEL.substring(0, 2);
        _year = Integer.parseInt(substringyear);
        return _year;
    }

    public int monthGenerator() {
        String substringmonth = _PESEL.substring(2, 4);
        _month = Integer.parseInt(substringmonth);
        return _month;
    }

    public int dayGenerator() {
        String substringday = _PESEL.substring(4, 6);
        _day = Integer.parseInt(substringday);
        return _day;
    }

    public String PrintDate() {
        return String.format("%s / %s / %s ", dayGenerator(), monthGenerator(), yearGenerator());
    }
}
