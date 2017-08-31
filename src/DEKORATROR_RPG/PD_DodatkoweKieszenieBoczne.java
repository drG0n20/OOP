package DEKORATROR_RPG;

public class PD_DodatkoweKieszenieBoczne extends DekoratorPlecaka {
    private Plecak _plecak;

    public PD_DodatkoweKieszenieBoczne(Plecak plecak) {
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + " z dodatkowymi kieszeniami";
    }

    @Override
    public double miejsce() {
        return _plecak.miejsce() + 5.0;
    }
}
