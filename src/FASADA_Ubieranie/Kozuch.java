package FASADA_Ubieranie;

public class Kozuch implements IUbranie {

    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam kozuch");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam kozuch");
    }
}
