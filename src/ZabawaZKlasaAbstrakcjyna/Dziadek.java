package ZabawaZKlasaAbstrakcjyna;

public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Za moich czasow...\n");
    }

    @Override
    public void walczOMiejsceWAutobuscie() {
        System.out.printf("Wali laska po nogach\n");
    }

    public void zapalPapierosa() {
        System.out.printf("Pale fajke\n");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.printf("Szarlotka Dziadka\n");
    }
}
