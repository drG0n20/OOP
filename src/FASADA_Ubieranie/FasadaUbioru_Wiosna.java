package FASADA_Ubieranie;

public class FasadaUbioru_Wiosna implements IUbranieNaPoreRoku {
    private Czapka _czapka;
    private Rekawiczki _rekawiczki;
    private DlugieSpodnie _dlugieSpodnie;

    public FasadaUbioru_Wiosna(Rekawiczki rekawiczki, Czapka czapka, DlugieSpodnie dlugieSpodnie) {
        _czapka = czapka;
        _rekawiczki = rekawiczki;
        _dlugieSpodnie = dlugieSpodnie;

    }

    @Override
    public void ubierzSie() {
        _rekawiczki.zalozUbranie();
        _czapka.zalozUbranie();
        _dlugieSpodnie.zalozUbranie();
    }

    @Override
    public void rozbierzSie() {
        _rekawiczki.zdejmijUbranie();
        _czapka.zdejmijUbranie();
        _dlugieSpodnie.zdejmijUbranie();
    }
}
