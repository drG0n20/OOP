package OBSERWATOR_StacjaPogodowa_JavaObserwator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11, 1030, 45);
        Thread.sleep(1000);
        dp.ustawZmienne(12, 1040, 50);
        Thread.sleep(1000);
        dp.ustawZmienne(13, 1050, 55);
    }
}
