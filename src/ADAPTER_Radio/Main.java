package ADAPTER_Radio;

public class Main {
    public static void main(String[] args) {
        DigitalRadio dr = new DigitalRadio();
        RadioFM fm = new RadioFM(8);
        AnalogtoDigitalAdapter adapter = new AnalogtoDigitalAdapter(fm);
        int[] zzz = adapter.getDigit();
    }
}
