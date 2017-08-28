package Sorter_STRATEGIA;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new BubbleSort());
        int[] tabToSort = {1, 4, 3, 7, 5, 6, 2};
        int[] sorted = sorter.doSorting(tabToSort);

        for (int element : sorted) {
            System.out.println(element);
        }

        Sorter sorter2 = new Sorter(new Zliczanie());
        int[] sorted2 = sorter2.doSorting(tabToSort);
    }
}
