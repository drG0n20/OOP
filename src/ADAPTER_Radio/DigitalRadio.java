package ADAPTER_Radio;

public class DigitalRadio implements IDigitalSignal {
    private int[] _digitalData;

    @Override
    public int[] getDigit() {
        return _digitalData;
    }

    @Override
    public void setDigit(int[] digitData) {
        _digitalData = digitData;
    }

    @Override
    public void printDigit() {
        for (int digitSig : _digitalData) {
            System.out.printf("%s", digitSig);
        }
    }
}
