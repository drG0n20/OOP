package DEKORATROR_RPG;

public abstract class Plecak {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract double miejsce();
}
