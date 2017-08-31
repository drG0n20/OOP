package DEKORATROR_RPG;

public class MD_LodowyPlomien extends DekoratorMiecza {
    private Miecz _miecz;

    public MD_LodowyPlomien(Miecz miecz) {
        _miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return _miecz.pobierzOpis() + " z lodowym plomieniem";
    }

    @Override
    public double atak() {
        return _miecz.atak() + 0.5;
    }
}
