package DEKORATROR_RPG;

public class PD_FoliaNaPlecak extends DekoratorPlecaka {
    private Plecak _plecak;

    public PD_FoliaNaPlecak(Plecak plecak) {
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + " nieprzemakalny";
    }

    @Override
    public double miejsce() {
        return _plecak.miejsce() + 1.0;
    }
}
