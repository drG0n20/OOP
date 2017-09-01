package FASADA_Ubieranie;

public class CzapkaZBobra implements IUbranie {

    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam czapke z bobra");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam czapke z bobra");
    }
}
