package DEKORATROR_RPG;

public class PD_PrzyczepkaNaKolkach extends DekoratorPlecaka {
    private Plecak _plecak;

    public PD_PrzyczepkaNaKolkach(Plecak plecak) {
        _plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return _plecak.pobierzOpis() + " z doczepiana przyczepka na kolkach";
    }

    @Override
    public double miejsce() {
        return _plecak.miejsce() + 10.0;
    }
}
