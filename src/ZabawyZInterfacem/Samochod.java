package ZabawyZInterfacem;

public class Samochod implements ICzterokolowy {
    @Override
    public void jedz() {
        System.out.printf("Jade!\n");
    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje!\n");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.printf("Jade na czolowke!\n");
    }
}
