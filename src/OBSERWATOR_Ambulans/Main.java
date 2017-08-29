package OBSERWATOR_Ambulans;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OperatorAdam dp = new OperatorAdam();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11, 1030, 45);
        Thread.sleep(10000);
        dp.ustawZmienne(13, 1045, 50);
    }
}
