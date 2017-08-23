package ZabawaZKlasaAbstrakcjyna;

public class Main {
    public static void main(String[] args) {
        Emeryt.glupiaMetoda();

//        Dziadek dziadek = new Dziadek();
//        dziadek.zapalPapierosa();
        Emeryt babcia = new Babcia();
        Emeryt babcia2 = (Emeryt) babcia;
        babcia.upieczSzarlotke();
        babcia2.upieczSzarlotke();
    }
}
