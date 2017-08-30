package DEKORATOR_Kawiarnia;

public class BitaSmietana extends SkladnikiDekorator {
    private Napoj _napoj;

    public BitaSmietana(Napoj napoj) {
        _napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() + " z bita smietana";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.10;
    }
}
