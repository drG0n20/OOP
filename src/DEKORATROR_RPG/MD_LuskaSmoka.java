package DEKORATROR_RPG;

public class MD_LuskaSmoka extends DekoratorMiecza {
    private Miecz _miecz;

    public MD_LuskaSmoka(Miecz miecz) {
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " z luska smoka";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 5.0;
    }
}
