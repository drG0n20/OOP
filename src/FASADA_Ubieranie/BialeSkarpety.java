package FASADA_Ubieranie;

public class BialeSkarpety implements IUbranie {
    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam biale skarpety");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam biale skarpety");
    }
}
