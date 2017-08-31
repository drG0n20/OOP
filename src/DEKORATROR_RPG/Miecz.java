package DEKORATROR_RPG;

public abstract class Miecz {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract double atak();
}
