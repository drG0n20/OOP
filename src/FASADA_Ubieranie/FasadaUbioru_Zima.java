package FASADA_Ubieranie;

public class FasadaUbioru_Zima implements IUbranieNaPoreRoku {
    private Rekawiczki _rekawiczki;
    private CzapkaZBobra _czapkaZBobra;
    private Onuce _onuce;
    private Kalesony _kalesony;
    private Kozuch _kozuch;
    private Sofixy _sofixy;


    public FasadaUbioru_Zima(Rekawiczki rekawiczki, CzapkaZBobra czapkaZBobra, Onuce onuce, Kalesony kalesony,
                             Kozuch kozuch, Sofixy sofixy) {
        _rekawiczki = rekawiczki;
        _czapkaZBobra = czapkaZBobra;
        _onuce = onuce;
        _kalesony = kalesony;
        _kozuch = kozuch;
        _sofixy = sofixy;
    }

    @Override
    public void ubierzSie() {
        _rekawiczki.zalozUbranie();
        _czapkaZBobra.zalozUbranie();
        _onuce.zalozUbranie();
        _kalesony.zalozUbranie();
        _kozuch.zalozUbranie();
        _sofixy.zalozUbranie();
    }

    @Override
    public void rozbierzSie() {
        _rekawiczki.zdejmijUbranie();
        _czapkaZBobra.zdejmijUbranie();
        _onuce.zdejmijUbranie();
        _kalesony.zdejmijUbranie();
        _kozuch.zdejmijUbranie();
        _sofixy.zdejmijUbranie();
    }
}
