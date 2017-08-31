package FASADA_Ubieranie;

public class Main {
    public static void main(String[] args) {
        Czapka czapka = new Czapka();
        Spodenki spodenki = new Spodenki();
        Rekawiczki rekawiczki = new Rekawiczki();

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(rekawiczki, czapka, spodenki);

        StrategiaUbioru su = new StrategiaUbioru(flu);

        su.ubieramySie();
        System.out.println("-------");
        su.rozbieramySie();

    }
}
