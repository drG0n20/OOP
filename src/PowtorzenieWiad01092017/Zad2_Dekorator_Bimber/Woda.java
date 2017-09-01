package PowtorzenieWiad01092017.Zad2_Dekorator_Bimber;

public class Woda extends BimberDekorator {
    private Napoj _napoj;
    private Bimber _bimber;

    public Woda(Napoj napoj) {
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + "";
    }

    @Override
    public double procenty() {
        return _napoj.procenty() - 8;
    }
}
