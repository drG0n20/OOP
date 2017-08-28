package STRATEGIA_Sorter;

public class Main {
    public static void main(String[] args) {
        int[] tabToSort = {6, 3, 6, 1, 4, 9, 0, 1, 8, 2, 6, 4, 9, 3, 7, 5, 9, 2, 7, 3, 2, 4, 1, 8, 7, 0, 8, 5, 8, 3, 6, 2, 5, 3};

        System.out.println("\n*** BubbleSort ***");
        Sorter sorter = new Sorter(new BubbleSort());
        int[] sorted = sorter.doSorting(tabToSort);
        for (int element : sorted) {
            System.out.print(element);
        }

        System.out.println("\n\n*** Sortowanie przez zliczanie ***");
        Sorter sorter2 = new Sorter(new Zliczanie());
        int[] sorted2 = sorter2.doSorting(tabToSort);
        for (int element : sorted2) {
            System.out.print(element);
        }

        System.out.println("\n\n*** Sortowanie przez kopcowanie ***");
        Sorter sorter3 = new Sorter(new Kopcowanie());
        int[] sorted3 = sorter3.doSorting(tabToSort);
        for (int element : sorted3) {
            System.out.print(element);
        }
    }
}
