package STRATEGIA_Sorter;

public class Zliczanie implements ISort {
    @Override
    public int[] sort(int[] tab) {
        int[] count = new int[200];
        int c;

        for (int i = 0; i < tab.length; i++) {
            count[tab[i]]++;
        }
        c = 0;

        for (int i = 0; i < tab.length; i++) {
            if (count[i] > 0) {
                for (int j = 1; j < count[i] + 1; j++) {
                    tab[c] = i;
                    c++;
                }
            }
        }
        return tab;
    }
}
