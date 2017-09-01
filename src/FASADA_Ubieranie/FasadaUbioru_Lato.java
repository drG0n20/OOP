package FASADA_Ubieranie;

public class FasadaUbioru_Lato implements IUbranieNaPoreRoku {
    private KrotkieSpodenki _krotkie_spodenki;
    private BialeSkarpety _bialeSkarpety;
    private Kuboty _kuboty;
    private KoszulkaZonobijka _koszulka;
    private Czapka _czapka;

    public FasadaUbioru_Lato(KrotkieSpodenki krotkieSpodenki, BialeSkarpety skarpety, Kuboty kuboty, KoszulkaZonobijka koszulka, Czapka czapka) {
        _krotkie_spodenki = krotkieSpodenki;
        _bialeSkarpety = skarpety;
        _kuboty = kuboty;
        _koszulka = koszulka;
        _czapka = czapka;
    }

    @Override
    public void ubierzSie() {
        _krotkie_spodenki.zalozUbranie();
        _bialeSkarpety.zalozUbranie();
        _kuboty.zalozUbranie();
        _koszulka.zalozUbranie();
        _czapka.zalozUbranie();
    }

    @Override
    public void rozbierzSie() {
        _krotkie_spodenki.zdejmijUbranie();
        _bialeSkarpety.zdejmijUbranie();
        _kuboty.zdejmijUbranie();
        _koszulka.zdejmijUbranie();
        _czapka.zdejmijUbranie();
    }
}
