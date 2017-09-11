package PowtorzenieWiad07092017.Zad3_LosowanieLiczb;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomNumersAmount = Integer.parseInt(args[0]);
//        Scanner sc = new Scanner();
        Random rand = new Random();
        int number = 0;
        int max = 0;
        int min = 0;
        int counter = 0;

        for (int i = 0; i < randomNumersAmount; i++) {
            number = rand.nextInt(100 - (-100)) + (-100);
            if (number > 0) {
                counter++;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.printf("Max: %d  Min: %d  Średnia: %.2f", max, min, ((double) counter) / randomNumersAmount);
    }

}
