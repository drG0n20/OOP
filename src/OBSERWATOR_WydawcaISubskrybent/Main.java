package OBSERWATOR_WydawcaISubskrybent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        KaczorDonald kd = new KaczorDonald();
        Fakt fakt = new Fakt();

        KubaM km = new KubaM(kd);

        kd.wydajNumer("KD: 1/2017");
        Thread.sleep(3000);
        kd.wydajNumer("KD: 2/2017");
        Thread.sleep(3000);

        km.rezygnujZGazety();
        System.out.println("KD KD KD");
        kd.wydajNumer("KD: 3/2017");
    }
}
