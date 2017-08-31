package FASADA_Ubieranie;

public class FasadaLetniegoUbioru implements IUbranieNaPoreRoku {
    private Czapka _czapka;
    private Rekawiczki _rekawiczki;
    private Spodenki _spodenki;

    public FasadaLetniegoUbioru(Rekawiczki rekawiczki, Czapka czapka, Spodenki spodenki) {
        _czapka = czapka;
        _rekawiczki = rekawiczki;
        _spodenki = spodenki;
    }

    @Override
    public void ubierzSie() {
        _spodenki.zalozUbranie();
        _rekawiczki.zalozUbranie();
        _czapka.zalozUbranie();
    }

    @Override
    public void rozbierzSie() {
        _spodenki.zdejmijUbranie();
        _rekawiczki.zdejmijUbranie();
        _czapka.zdejmijUbranie();
    }
}
