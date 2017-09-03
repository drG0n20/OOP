package PowtorzenieWiad01092017.Zad1_Strategia;

public class Nieparzyste implements IAlgorytm {
    @Override
    public int[] Uruchom(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        return tab;
    }
}
