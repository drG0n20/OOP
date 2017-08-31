package FASADA;

public class Main {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        ThermoMix tm = new ThermoMix();
        Wzmacniacz wzm = new Wzmacniacz();

        FasadaKinaDomowego fasada = new FasadaKinaDomowego(tv, tm, wzm);

        fasada.wrocDoDomu();
        System.out.println("---------");
        fasada.wyjdzZDomu();
    }
}
