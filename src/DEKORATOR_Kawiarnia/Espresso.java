package DEKORATOR_Kawiarnia;

public class Espresso extends Napoj {

    public Espresso() {
        opis = "Espresso";
    }

    @Override
    public double koszt() {
        return 1.99;
    }
}
