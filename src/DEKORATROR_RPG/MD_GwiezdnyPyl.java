package DEKORATROR_RPG;

public class MD_GwiezdnyPyl extends DekoratorMiecza {
    private Miecz _miecz;

    public MD_GwiezdnyPyl(Miecz miecz) {
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " z gwiezdnym pylem";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 2.5;
    }
}
