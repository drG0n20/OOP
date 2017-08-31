package DEKORATROR_RPG;

public class Bohater {
    private String _imie;

    public Bohater(String imie) {
        _imie = imie;
    }

    public String getImie() {
        return _imie;
    }

    public void setImie(String imie) {
        _imie = _imie;
    }
    
    public String toString() {
        return String.format("%s", _imie);
    }
}
