package DEKORATOR_Kawiarnia;

public class StraCafeSpecial extends Napoj {
    
    public StraCafeSpecial() {
        opis = "StarCafeSpecial";
    }

    @Override
    public double koszt() {
        return 0.89;
    }
}
