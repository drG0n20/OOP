package Sorter_STRATEGIA;

public class Zliczanie implements ISort {
    @Override
    public int[] sort(int[] tab) {
        int n = tab.length - 2;
        int max = tab.length + 1;

        int[] tab2 = new int[n];

        for (int i = 0; i < n; i++) {
            tab2[i] = tab[i + 2];
        }

        int[] tablicaDoZliczania = new int[max];
        for (int i = 0; i < tab2.length; i++) {
            int liczba = tab2[i];
            tablicaDoZliczania[liczba]++;
        }
    }
}
