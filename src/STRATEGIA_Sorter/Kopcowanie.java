package STRATEGIA_Sorter;

public class Kopcowanie implements ISort {
    @Override
    public int[] sort(int[] tab) {
        buildHeap(tab);
        for (int i = tab.length - 1; i > 0; i--) {
            swap(tab, 0, i);
            buildMaxHeap(tab, 0, i - 1);
        }
        return tab;
    }


    public void buildHeap(int tab[]) {
        for (int i = (tab.length - 1) / 2; i >= 0; i--)
            buildMaxHeap(tab, i, tab.length - 1);
    }

    public void buildMaxHeap(int tab[], int i, int N) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && tab[left] > tab[i])
            max = left;
        if (right <= N && tab[right] > tab[max])
            max = right;
        if (max != i) {
            swap(tab, i, max);
            buildMaxHeap(tab, max, N);
        }
    }

    public void swap(int tab[], int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }
}

