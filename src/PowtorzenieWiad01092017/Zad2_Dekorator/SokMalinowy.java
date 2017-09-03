package PowtorzenieWiad01092017.Zad2_Dekorator;

public class SokMalinowy extends BimberDekorator {
    private Napoj _napoj;
    private Bimber _bimber;

    public SokMalinowy(Napoj napoj) {
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " z sokiem malinowym";
    }

    @Override
    public double procenty() {
        return _napoj.procenty() - 0;
    }
}
