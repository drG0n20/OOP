package FASADA_Ubieranie;

public class Main {
    public static void main(String[] args) {
        BialeSkarpety skarpety = new BialeSkarpety();
        Czapka czapka = new Czapka();
        CzapkaZBobra czZB = new CzapkaZBobra();
        DlugieSpodnie ds = new DlugieSpodnie();
        Kalesony kalesony = new Kalesony();
        KoszulkaZonobijka koszulka = new KoszulkaZonobijka();
        Kozuch kozuch = new Kozuch();
        KrotkieSpodenki spodenki = new KrotkieSpodenki();
        Kuboty kuboty = new Kuboty();
        Onuce onuce = new Onuce();
        Rekawiczki rekawiczki = new Rekawiczki();
        Sofixy sofixy = new Sofixy();

        FasadaUbioru_Zima zima = new FasadaUbioru_Zima(rekawiczki, czZB, onuce, kalesony, kozuch, sofixy);
        FasadaUbioru_Lato lato = new FasadaUbioru_Lato(spodenki, skarpety, kuboty, koszulka, czapka);
        FasadaUbioru_Wiosna wiosna = new FasadaUbioru_Wiosna(rekawiczki, czapka, ds);
        FasadaUbioru_Jesien Jesien = new FasadaUbioru_Jesien(rekawiczki, czapka, ds);

        StrategiaUbioru su = new StrategiaUbioru(zima);
        su.ubieramySie();
        System.out.println("-------");
        su.rozbieramySie();
    }
}
