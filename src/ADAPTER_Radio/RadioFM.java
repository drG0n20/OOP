package ADAPTER_Radio;

import java.util.Random;

public class RadioFM implements IAnalogSignal {
    private double[] _analogData;

    RadioFM() {
    }

    RadioFM(int signalLength) {
        Random rand = new Random();
        _analogData = rand.doubles(8 * signalLength, 0.0, 2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return _analogData;
    }

    @Override
    public void setAnalog(double[] analogData) {
        _analogData = analogData;
    }

    @Override
    public void printAnalog() {
        for (double analSig : _analogData) {
            System.out.printf("%f", analSig);
        }
    }
}
