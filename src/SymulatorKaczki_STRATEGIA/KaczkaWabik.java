package SymulatorKaczki_STRATEGIA;

public class KaczkaWabik extends Kaczka {
    public KaczkaWabik() {
        latanie = new NieLatam();
        kwakanie = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Kaczke wabik");
    }
}
