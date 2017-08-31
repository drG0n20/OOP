package FASADA_Ubieranie;

public class Czapka implements IUbranie {
    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam czapka");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam czapka");
    }
}
