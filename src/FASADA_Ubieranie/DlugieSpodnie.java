package FASADA_Ubieranie;

public class DlugieSpodnie implements IUbranie {

    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam dlugie spodnie");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam dlugie spodnie");
    }
}
