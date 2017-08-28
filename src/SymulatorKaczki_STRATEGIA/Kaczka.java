package SymulatorKaczki_STRATEGIA;

public abstract class Kaczka {
    protected ILatanie latanie;
    protected IKwakanie kwakanie;  //mozna wstawic tu dowolne obiekty, ktore wdrazaja interface'y

    public void plywaj() {
        System.out.println("Plywu plywu!");
    }

    public void wyswietl() {
        System.out.println("Wyswietlam kaczke!");
    }

    public void wykonajLatanie() {
        latanie.lec();
    }

    public void wykonajKwakanie() {
        kwakanie.kwacz();
    }

    public void setLatanie(ILatanie latanie) {
        this.latanie = latanie;
    }

    public void setKwakanie(IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
}
