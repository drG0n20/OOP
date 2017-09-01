package FASADA_Ubieranie;

public class Onuce implements IUbranie {

    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam onuce");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam onuce");
    }
}
