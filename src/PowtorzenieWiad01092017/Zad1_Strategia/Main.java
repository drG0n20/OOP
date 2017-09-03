package PowtorzenieWiad01092017.Zad1_Strategia;

public class Main {
    public static void main(String[] args) {
        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        StrategiaKonia sk = new StrategiaKonia(new Parzyste());
        System.out.println("Liczby Parzystne:");
        int[] parzyste = sk.wypiszLiczby(tab);


        StrategiaKonia sk2 = new StrategiaKonia(new Nieparzyste());
        System.out.println("\nLiczby Nieparzystne:");
        int[] nieparzyste = sk2.wypiszLiczby(tab);

    }
}
