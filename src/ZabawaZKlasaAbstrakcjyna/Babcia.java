package ZabawaZKlasaAbstrakcjyna;

public class Babcia extends Emeryt {

    @Override
    public void krzyczNaDzieci() {
        System.out.printf("Zostaw ziemniaki, zjedz chociaz mieso!\n");
    }

    @Override
    public void walczOMiejsceWAutobuscie() {
        System.out.printf("Wale torba przez leb\n");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.printf("\nSuper Babcina szarlotka\n");
    }
}
