//package ADAPTER_Radio;
//
//public class AnalogtoDigitalAdapter implements IDigitalSignal {
//    private IAnalogSignal _analogSignal;
//
//    public AnalogtoDigitalAdapter(IAnalogSignal analogSignal) {
//        _analogSignal = analogSignal;
//    }
//
//    @Override
//    public int[] getDigit() {
//        return (int[]) _analogSignal.getAnalog();
//    public double[] getDigit() {
//        return _analogSignal.getAnalog();
//    }
//
//    @Override
//    public void setDigit(int[] digitData) {
//
//    }
//
//    @Override
//    public void printDigit() {
//        int[] digitalSignal = recalculteAnalogToDigit();
//        for (int digitalSignalPart : digitalSignal) {
//            System.out.printf("%d ", digitalSignalPart);
//        }
//    }
//
//    private int[] recalculteAnalogToDigit() {
//        double[] signal = _analogSignal.getAnalog();
//        int[] digitalSignal = new int[Math.floorDiv(signal.length, 8)];
//        int sum = 0;
//        for (int i = 0, it = 0; i < signal.length; i = i + 8) {
//            for (int j = 0; j < 8; j++) {
//                if (signal[i + j] > 1.0) {
//                    sum += Math.pow(2, j);
//                }
//            }
//            digitalSignal[it] = sum;
//            it++;
//            sum = 0;
//        }
//        return digitalSignal;
//    }
//}
