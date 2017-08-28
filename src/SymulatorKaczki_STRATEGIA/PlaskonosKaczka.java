package SymulatorKaczki_STRATEGIA;

public class PlaskonosKaczka extends Kaczka {
    public PlaskonosKaczka() {
        latanie = new LatamBoMamSkrzydla(); //ustawiam logike latania
        kwakanie = new Kwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyswietlam plaskonosa!");
    }
}
