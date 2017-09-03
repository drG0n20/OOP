package PowtorzenieWiad01092017.Zad4_Fasada;

public class MietowaFasada {
    private Mieta _mieta;
    private CukierPuder _cukierPuder;
    private Talk _talk;

    public MietowaFasada(Mieta mieta, CukierPuder cukierPuder, Talk talk) {
        _mieta = mieta;
        _cukierPuder = cukierPuder;
        _talk = talk;
    }

    public void rozrobMietowyProszek() {
        _mieta.Dodaj();
        _cukierPuder.Dodaj();
        _talk.Dodaj();
    }
}