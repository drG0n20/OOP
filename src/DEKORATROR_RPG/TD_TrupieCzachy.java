package DEKORATROR_RPG;

public class TD_TrupieCzachy extends DekoratorTarcz {
    private Tarcza _tarcza;

    public TD_TrupieCzachy(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " z trupimi czachami";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 2.5;
    }
}
