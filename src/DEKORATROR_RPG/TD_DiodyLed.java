package DEKORATROR_RPG;

public class TD_DiodyLed extends DekoratorTarcz {
    private Tarcza _tarcza;

    public TD_DiodyLed(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " z diodami led";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 3.5;
    }
}
