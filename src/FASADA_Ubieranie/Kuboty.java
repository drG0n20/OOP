package FASADA_Ubieranie;

public class Kuboty implements IUbranie {
    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam Kuboty");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam Kuboty");
    }
}
