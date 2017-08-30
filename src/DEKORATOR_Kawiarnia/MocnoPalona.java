package DEKORATOR_Kawiarnia;

public class MocnoPalona extends Napoj {

    public MocnoPalona() {
        opis = "MocnoPalona";
    }

    @Override
    public double koszt() {
        return 0.99;
    }
}
