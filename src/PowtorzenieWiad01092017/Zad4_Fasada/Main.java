package PowtorzenieWiad01092017.Zad4_Fasada;

public class Main {
    public static void main(String[] args) {
        Mieta mieta = new Mieta();
        CukierPuder cukierPuder = new CukierPuder();
        Talk talk = new Talk();

        MietowaFasada mietowaFasada = new MietowaFasada(mieta, cukierPuder, talk);
        mietowaFasada.rozrobMietowyProszek();
    }
}
