package FASADA_Ubieranie;

public class Rekawiczki implements IUbranie {
    @Override
    public void zalozUbranie() {
        System.out.println("Zakladam rekawiczki");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Sciagam rekawiczki");
    }
}
