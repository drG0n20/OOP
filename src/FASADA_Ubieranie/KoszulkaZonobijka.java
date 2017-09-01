package FASADA_Ubieranie;

public class KoszulkaZonobijka implements IUbranie {
    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam koszulke");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam koszulke");
    }
}
