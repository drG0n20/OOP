package PowtorzenieWiad01092017.Zad1_Strategia;

public class StrategiaKonia {
    private IAlgorytm _algorytm;

    public StrategiaKonia(IAlgorytm algorytm) {
        _algorytm = algorytm;
    }

    public void setAlgorytm(IAlgorytm algorytm) {
        _algorytm = algorytm;
    }

    public int[] wypiszLiczby(int[] tab) {
        return _algorytm.Uruchom(tab);
    }
}
