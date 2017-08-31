package FASADA;

public class FasadaKinaDomowego {
    private Telewizor _telewizor;
    private ThermoMix _thermoMix;
    private Wzmacniacz _wzmacniacz;

    public FasadaKinaDomowego(Telewizor tv, ThermoMix tm, Wzmacniacz wz) {
        _telewizor = tv;
        _thermoMix = tm;
        _wzmacniacz = wz;
    }

    public void wrocDoDomu() {
        _thermoMix.wlacz();
        _thermoMix.zrobObiad();
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawGloscnosc();
        _telewizor.ustawKanal();
    }

    public void wyjdzZDomu() {
        _thermoMix.wylacz();
        _wzmacniacz.wylacz();
        _telewizor.wylacz();
    }
}
