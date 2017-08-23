package ZabawaZKlasaAbstrakcjyna;

public abstract class Emeryt implements ISzarlotka {

    public static final int ILOSC_OCZODOLOW = 2; //stala

    public abstract void krzyczNaDzieci(); //metoda abstrakcjyna

    public abstract void walczOMiejsceWAutobuscie();

    public void biegnijDoSklepu(int odleglosc, int predkosc) {
        double czas = (double) odleglosc / predkosc;
        System.out.println("Biegnepo kiełbasebedeza " + czas);
    }

    public static void glupiaMetoda() {
    }

    public void upieczSzarlotke() {
        System.out.printf("Emerytowa Szarlotka\n");
    }
}
