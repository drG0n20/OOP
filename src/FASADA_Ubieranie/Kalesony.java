package FASADA_Ubieranie;

public class Kalesony implements IUbranie {

    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam kalesony");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam kalesony");
    }
}
