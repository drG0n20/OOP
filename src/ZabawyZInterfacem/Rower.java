package ZabawyZInterfacem;

public class Rower implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.printf("Jade Rowerem!\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje Rowerem!\n");
    }

    @Override
    public void przewrocsie() {
        System.out.printf("Wywracam sie!\n");
    }
}
