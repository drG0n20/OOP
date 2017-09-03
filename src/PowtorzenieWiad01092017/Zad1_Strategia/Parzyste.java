package PowtorzenieWiad01092017.Zad1_Strategia;

public class Parzyste implements IAlgorytm {
    @Override
    public int[] Uruchom(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        return tab;
    }
}
