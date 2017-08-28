package SymulatorKaczki_STRATEGIA;

public class KaczkaModel extends Kaczka {
    public KaczkaModel() {
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Kaczka model sie pojawila!");
    }
}
