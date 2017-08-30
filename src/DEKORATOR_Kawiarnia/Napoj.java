package DEKORATOR_Kawiarnia;

public abstract class Napoj {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract double koszt();
}


