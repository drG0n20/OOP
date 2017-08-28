package STRATEGIA_SymulatorKaczki;

public class Main {
    public static void main(String[] args) {
//        Kaczka kaczka = new Kaczka();
//        DzikaKaczka dzikaKaczka = new DzikaKaczka();
//        PlaskonosKaczka plaskonosKaczka = new PlaskonosKaczka();
//        KaczkaWabik kw = new KaczkaWabik();
//        GumowaKaczka gumowaKaczka = new GumowaKaczka();
        KaczkaModel kaczkaModel = new KaczkaModel();

//        kaczka.wykonajKwakanie();
//        kaczka.wykonajLatanie();
//        dzikaKaczka.wyswietl();
//        dzikaKaczka.wykonajKwakanie();
//        dzikaKaczka.wykonajLatanie();
//        plaskonosKaczka.wyswietl();
//        plaskonosKaczka.wykonajKwakanie();
//        plaskonosKaczka.wykonajLatanie();
//        kw.wyswietl();
//        kw.wykonajKwakanie();
//        kw.wykonajLatanie();

        kaczkaModel.wyswietl();
        kaczkaModel.wykonajLatanie();
        kaczkaModel.setLatanie(new LotZNapedemRakietowym());
        kaczkaModel.wykonajLatanie();
    }
}
