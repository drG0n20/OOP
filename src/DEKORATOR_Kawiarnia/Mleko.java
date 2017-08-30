package DEKORATOR_Kawiarnia;

public class Mleko extends SkladnikiDekorator {
    private Napoj _napoj;

    public Mleko(Napoj napoj) {
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " z mlekiem";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.10;
    }
}
