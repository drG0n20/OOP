package PowtorzenieWiad01092017.Zad2_Dekorator;

public abstract class Main {
    public static void main(String[] args) {
        Bimber bimber = new Bimber();
        Woda woda = new Woda(bimber);
        Woda woda1 = new Woda(woda);
        Woda woda2 = new Woda(woda1);
        Woda woda3 = new Woda(woda2);
        Woda woda4 = new Woda(woda3);
        Woda woda5 = new Woda(woda4);
        Woda woda6 = new Woda(woda5);
        SokMalinowy sm = new SokMalinowy(woda6);

        System.out.printf("Nazwa: %s :: procenty: %.2f\n", sm.pobierzOpis(), sm.procenty());
    }


}
