package FASADA_Ubieranie;

public class Spodenki implements IUbranie {

    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam spodenki");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam spodenki");
    }
}
