package PowtorzenieWiad01092017.Zad2_Dekorator;

public abstract class Napoj {
    protected String opis;

    public String pobierzOpis() {
        return opis;
    }

    public abstract double procenty();
}
