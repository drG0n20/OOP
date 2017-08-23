package ZabawyZInterfacem;

public class Motocykl implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jade Motorem!\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje Motorem!\n");
    }

    @Override
    public void przewrocsie() {
        System.out.printf("Wywracam sie Motorem!\n");
    }

    public void dodajGazu() {
        System.out.printf("Dodaje gazu!\n");
    }
}
