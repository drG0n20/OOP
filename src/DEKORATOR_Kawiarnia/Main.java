package DEKORATOR_Kawiarnia;

public class Main {

    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        Mleko mleko = new Mleko(czek);
        MleczkoSojowe ms = new MleczkoSojowe(mleko);
        BitaSmietana bs = new BitaSmietana(ms);

        System.out.printf("Nazwa: %s :: Cena: %.2f\n", czek.pobierzOpis(), czek.koszt());
        System.out.printf("Nazwa: %s :: Cena: %.2f\n", mleko.pobierzOpis(), mleko.koszt());
        System.out.printf("Nazwa: %s :: Cena: %.2f\n", ms.pobierzOpis(), ms.koszt());
        System.out.printf("Nazwa: %s :: Cena: %.2f\n", bs.pobierzOpis(), bs.koszt());


    }
}
