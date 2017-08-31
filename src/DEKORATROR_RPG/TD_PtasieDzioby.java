package DEKORATROR_RPG;

public class TD_PtasieDzioby extends DekoratorTarcz {
    private Tarcza _tarcza;

    public TD_PtasieDzioby(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " z ptasimi dziobami";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 1.5;
    }
}
