package DEKORATOR_Kawiarnia;

public class MleczkoSojowe extends SkladnikiDekorator {
    private Napoj _napoj;

    public MleczkoSojowe(Napoj napoj) {
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " z mleczkiem sojowym";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.15;
    }
}
