package SymulatorKaczki_STRATEGIA;

public class GumowaKaczka extends Kaczka {
    public GumowaKaczka() {
        latanie = new NieLatam();
        kwakanie = new Piszczenie();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyglada jak gumowa kaczka!");
    }
}
